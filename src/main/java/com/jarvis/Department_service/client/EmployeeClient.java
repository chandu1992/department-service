package com.jarvis.Department_service.client;

import com.jarvis.Department_service.model.EmployeeReco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class EmployeeClient {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<EmployeeReco> getEmployeesByDepartmentId(Long deptId) {
        return webClientBuilder.build()
                .get()
                .uri("http://employee-service/employee/department/" + deptId)
                .retrieve()
                .bodyToFlux(EmployeeReco.class)
                .collectList()
                .block();
    }
}
