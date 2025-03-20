package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpDaoImpl {

    @Autowired
    EmpRepo empRepo;

    //savedata
    public Employee saveData(Employee employee){
        return empRepo.save(employee);
    }

    //getalldata
    public List<Employee> getAllData(){
        return empRepo.findAll();
    }

    //updatedata
    public Employee updateData(Employee employee){
        return empRepo.save(employee);
    }

    //deletedata
    public void deleteData(){
        empRepo.deleteAll();
    }
}
