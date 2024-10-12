package kz.kbtu.sf.base.service;

import kz.kbtu.sf.base.dto.EmployeeDTO;
import kz.kbtu.sf.base.model.Employee;
import kz.kbtu.sf.base.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setDateOfBirth(employeeDTO.getDateOfBirth());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        return  employeeRepository.save(employee);
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
