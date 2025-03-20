package com.csi.dao.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.csi.dao.EmpDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmpRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpDaoTest {

    @Autowired
    EmpDaoImpl empDao;

    @MockBean
    EmpRepo empRepo;

    @Test
    public void getAllDataTest(){

        when(empRepo.findAll()).thenReturn(Stream.of(new Employee(1, "RAM", 60000),
                new Employee(2, "KOMAL", 25000),
                new Employee(3, "SHRI", 35000)).toList());

        assertEquals(3, empDao.getAllData().size());
    }

    @Test
    public void saveDataTest(){

        Employee employee = new Employee(1, "RAM", 60000);
        empDao.saveData(employee);
        verify(empRepo, times(1)).save(employee);
    }

    @Test
    public void updateDataTest(){
        Employee employee = new Employee(1, "RAM", 60000);
        empDao.updateData(employee);
        verify(empRepo, times(1)).save(employee);
    }

    @Test
    public void deleteDataTest(){
        Employee employee = new Employee(1, "RAM", 60000);
        empDao.deleteData();
        verify(empRepo, times(1)).deleteAll();
    }
}
