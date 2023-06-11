package com.example.demo.mapper;

import com.example.demo.dao.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;

public class EmployeeMapper {
    public static EmployeeEntity mapEmployeeDtoToEmployeeEntity(EmployeeDto employeeDto){
        return EmployeeEntity.builder().firstname(employeeDto.getFirstname())
                .lastname(employeeDto.getLastname())
                .age(employeeDto.getAge())
                .build();

    }
}
