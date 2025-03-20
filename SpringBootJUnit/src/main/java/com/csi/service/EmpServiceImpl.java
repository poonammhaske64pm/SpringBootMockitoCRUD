package com.csi.service;

import com.csi.dao.EmpDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl {

    @Autowired
    EmpDaoImpl empDao;

    //savedata
    public Employee saveData(Employee employee){
        return empDao.saveData(employee);
    }

    //getalldata
    public List<Employee> getAllData(){
        return empDao.getAllData();
    }

    //updatedata
    public Employee updateData(Employee employee){
        return empDao.updateData(employee);
    }

    //deletedata
    public void deleteData(){
        empDao.deleteData();
    }
}
