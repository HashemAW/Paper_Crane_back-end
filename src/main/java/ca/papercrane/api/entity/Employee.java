package ca.papercrane.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Represents an employee in our database. An Employee may do the following:
 * <p>
 * 1) Access video training courses
 * 2) Request time off
 * 3) Log their working time per project through a form
 * 4) View past hours submissions in a calendar layout
 * 5) Add and modify client accounts
 */
@Entity
@Table(name = "employee")
public final class Employee extends Client {

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "employee_role", nullable = false)
    private String employeeRole;

    public Employee() {
        // default no-args constructor.
    }

    /**
     * Constructs a new Employee object with the given employee name and role.
     *
     * @param type         TODO: Find out what the type represents.
     * @param email        The email tied to this Employee user account.
     * @param password     The password tied to this Employee user account.
     * @param clientName   The client name of the Client
     * @param website      The website of the Client
     * @param employeeName The employee name of the Employee
     * @param employeeRole The employee role of the Employee
     */
    public Employee(String type, String email, String password, String clientName, String website,
                    String employeeName, String employeeRole) {
        super(type, email, password, clientName, website);
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
    }

    //Get the name of the employee.
    public String getName() {
        return employeeName;
    }

    //Set the new role for this employee.
    public void setRole(String newEmployeeRole) {
        this.employeeRole = newEmployeeRole;
    }

}