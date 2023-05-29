package gipsyservices.controller;

import gipsyservices.model.Employee;
import gipsyservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("list")
    public ResponseEntity<List<Employee>> getAllEmployees () {

        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("{employeeId}")
    public ResponseEntity getAllEmployeeById (@PathVariable String employeeId) {

        Optional<Employee> employee = employeeService.findById(employeeId);

        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        } else {
            return ResponseEntity.ok("Employee not found");
        }
    }

    @PostMapping("save")
    public ResponseEntity<Employee> saveEmployee (@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @DeleteMapping("delete/{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId) {
        employeeService.deleteById(employeeId);
    }



}
