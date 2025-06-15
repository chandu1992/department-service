package com.jarvis.Department_service.controller;

import com.jarvis.Department_service.client.EmployeeClient;
import com.jarvis.Department_service.model.Department;
import com.jarvis.Department_service.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department add(@RequestBody Department data){
        LOGGER.info("Add department {}",data);
        return departmentRepository.addDepartment(data);

    }

    @GetMapping("/getData")
    public List<Department> findAll(){
        LOGGER.info("Find all department");
        return departmentRepository.finaAll();
    }

    @GetMapping("/get/{id}")
    public Department findById(@PathVariable Long id){
        LOGGER.info("find by id");
        return departmentRepository.findById(id);
    }
}
