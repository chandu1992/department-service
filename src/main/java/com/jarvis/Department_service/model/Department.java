package com.jarvis.Department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private Long id;
    private String name;

    private List<EmployeeReco> empData = new ArrayList<>();

    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeReco> getEmpData() {
        return empData;
    }

    public void setEmpData(List<EmployeeReco> empData) {
        this.empData = empData;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", empData=" + empData +
                '}';
    }
}
