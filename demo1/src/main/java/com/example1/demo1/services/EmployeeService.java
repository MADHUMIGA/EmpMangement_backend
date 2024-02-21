package com.example1.demo1.services;

import java.util.List;

//components
import com.example1.demo1.model.EmployeeDetails;
import com.example1.demo1.repository.EmployeeRepository;
//annotation
import org.springframework.stereotype.Service;





@Service
public class EmployeeService {
    
    private EmployeeRepository employeeRepository;
    // @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    

    public EmployeeDetails savEmp(EmployeeDetails employeeDetails){
            return employeeRepository.save(employeeDetails);
    }

    public List<EmployeeDetails> getAllEmp(){
        return employeeRepository.findAll();
    }

    public List<EmployeeDetails> getEmpByName(String empName){
      return employeeRepository.findByempName(empName);
    }
    

    public EmployeeDetails updateEmp(EmployeeDetails employeeDetails){
        return employeeRepository.save(employeeDetails);
    }
    
    public void delEmpByName(String empName){
     employeeRepository.delByempName(empName);

    }
   

}