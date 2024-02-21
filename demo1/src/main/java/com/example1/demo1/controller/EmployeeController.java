package com.example1.demo1.controller;

import java.util.List;

//components
import com.example1.demo1.model.EmployeeDetails;
import com.example1.demo1.services.EmployeeService;

//annotations
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    // @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @PostMapping("/addemp")
    public EmployeeDetails addEmp(@RequestBody EmployeeDetails employeeDetails) {    
        return employeeService.savEmp(employeeDetails);
    }

    @GetMapping("/emplist")
    public List<EmployeeDetails> empList() {
        return employeeService.getAllEmp();
    }
    
    
    @GetMapping("/search/{empName}")
    public List<EmployeeDetails> searchEmp(@PathVariable String empName) {
        return employeeService.getEmpByName(empName);
    }
    
    @PutMapping("/editemp/{id}")
    public ResponseEntity<EmployeeDetails> editEmp(@PathVariable Long id, @RequestBody EmployeeDetails employeeDetails) {
       EmployeeDetails obj=employeeService.updateEmp(employeeDetails);
       if(obj!=null)
           return new ResponseEntity<>(HttpStatus.CREATED);
        else
          return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
     }
   

    @DeleteMapping("/delete/{empName}")
        public void delEmp(@PathVariable String empName){
             employeeService.delEmpByName(empName);
        }
          
     
}