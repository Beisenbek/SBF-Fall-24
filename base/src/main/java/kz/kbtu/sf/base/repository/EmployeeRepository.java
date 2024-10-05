package kz.kbtu.sf.base.repository;

import kz.kbtu.sf.base.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}
