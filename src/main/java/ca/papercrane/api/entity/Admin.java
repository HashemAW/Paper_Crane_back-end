package ca.papercrane.api.entity;

import ca.papercrane.api.entity.role.EmployeeRole;
import ca.papercrane.api.entity.role.UserRole;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@Entity
public final class Admin extends Employee {

    /**
     * Creates a new Admin.
     *
     * @param email     The email for the user.
     * @param password  The password for the user.
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     * @param type      The type of employee category this admin falls under.
     */
    public Admin(String email, String password, String firstName, String lastName, EmployeeRole type) {
        super(email, password, firstName, lastName, type);
        this.setRole(UserRole.ADMIN);
    }

}