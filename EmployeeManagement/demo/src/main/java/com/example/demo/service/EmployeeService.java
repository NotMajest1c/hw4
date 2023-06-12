package com.example.demo.service;

import com.example.demo.dao.entity.EmployeeEntity;
import com.example.demo.dao.repository.EmployeeRepository;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.EmployeeDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Optional<EmployeeEntity> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }
    public void addEmployee(EmployeeDto employeeDto) {
        var entity = EmployeeMapper.mapEmployeeDtoToEmployeeEntity(employeeDto);
        employeeRepository.save(entity);
    }
    public List<EmployeeEntity> getAllEmployees() {
        return (List<EmployeeEntity>) employeeRepository.findAll();
    }
    public void updateEmployee(EmployeeDto employeeDto, Long id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(id);
        if (employeeEntity.isPresent()) {
            EmployeeEntity employee = employeeEntity.get();
            employee.setFirstname(employeeDto.getFirstname());
            employee.setLastname(employeeDto.getLastname());
            employee.setAge(employeeDto.getAge());
            employee.setUpdatedAt(LocalDateTime.now());
            employeeRepository.save(employee);
        }
    }
}
