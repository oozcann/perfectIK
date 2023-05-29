package gipsyservices.service;

import gipsyservices.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeService extends MongoRepository<Employee,String> {

}
