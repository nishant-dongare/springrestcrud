package springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springrest.entity.Employee;
import springrest.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return empService.getEmployee();
		
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee e) {
		return empService.addEmployee(e);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeebyid(@PathVariable int id){
		return empService.getEmployeeDetailById(id);
		
	}
}