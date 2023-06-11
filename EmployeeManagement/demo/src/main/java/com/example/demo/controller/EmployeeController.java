package com.example.demo.controller;

import com.example.demo.dao.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/find-by-id/{id}")
    Optional<EmployeeEntity> getEmployeesById(
            @PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void addEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.addEmployee(employeeDto);
    }

    @PostMapping("update-by-id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    void updateEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable Long id){
        employeeService.updateEmployee(employeeDto,id);
    }

}
