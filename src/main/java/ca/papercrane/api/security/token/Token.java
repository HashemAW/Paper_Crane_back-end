package ca.papercrane.api.security.token;

import ca.papercrane.api.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a JWT (JSON Web Token)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public final class Token {

    /**
     * The unique identifier of the token.
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * The token string.
     */
    @Column(unique = true)
    private String token;

    /**
     * The type of the token.
     */
    @Enumerated(EnumType.STRING)
    private TokenType tokenType;

    /**
     * Has the token been revoked.
     */
    private boolean revoked;

    /**
     * Has the token has expired.
     */
    private boolean expired;

    /**
     * The user associated with the token.
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    /**
     * Invalidates the token.
     */
    public void invalidate() {
        setRevoked(true);
        setExpired(true);
    }

}