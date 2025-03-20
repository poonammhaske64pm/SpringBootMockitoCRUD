package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmpServiceImpl empService;

    //savedata
    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(empService.saveData(employee));
    }

    //getalldata
    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(empService.getAllData());
    }

    //updatedata
    @PutMapping("/updatedata")
    public ResponseEntity<Employee> updateData(@RequestBody Employee employee){
        return ResponseEntity.ok(empService.updateData(employee));
    }

    //deletedata
    @DeleteMapping("/deletealldata")
    public ResponseEntity<String> deleteData(){
        empService.deleteData();
        return ResponseEntity.ok("DATA DELETED");
    }
}
