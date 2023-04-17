package springrest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springrest.entity.Employee;
import springrest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployee(){
		return employeeRepository.findAll();
	}
	public Employee addEmployee(Employee e) {
		return employeeRepository.save(e);
		
	}
	
	
	public Employee getEmployeeDetailById(int id)
	{
		return employeeRepository.findById(id).get();
	}
}