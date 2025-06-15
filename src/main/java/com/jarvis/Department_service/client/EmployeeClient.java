package com.jarvis.Department_service.client;

import com.jarvis.Department_service.model.EmployeeReco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetMapping("/employee/department/{id}")
    public List<EmployeeReco> findByDepartId(@PathVariable Long id);
}
