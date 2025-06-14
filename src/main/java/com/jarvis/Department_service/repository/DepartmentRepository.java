package com.jarvis.Department_service.repository;

import com.jarvis.Department_service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    List<Department> demaprtmentList = new ArrayList<>();

    public Department addDepartment(Department depa) {
        demaprtmentList.add(depa);
        return depa;
    }

    public Department findById(Long id){
        return demaprtmentList.stream().filter(departmen -> departmen.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Department> finaAll(){
        return demaprtmentList;
    }
}
