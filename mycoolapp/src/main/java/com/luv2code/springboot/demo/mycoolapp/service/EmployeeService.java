package com.luv2code.springboot.demo.mycoolapp.service;

import com.luv2code.springboot.demo.mycoolapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
