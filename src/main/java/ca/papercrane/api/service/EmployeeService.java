package ca.papercrane.api.service;

import ca.papercrane.api.entity.Employee;
import ca.papercrane.api.entity.role.UserRole;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    List<Employee> getAllWithRole(UserRole role);

    List<Employee> getAllWithType(String type);

    Employee getByUserId(Integer userId);

    Employee getByEmail(String email);

    Integer addNewEmployee(Employee employee);

    void update(Employee employee);

    void save(Employee employee);

    void delete(Employee employee);

    void deleteByUserId(Integer userId);

    Long totalCount();


}