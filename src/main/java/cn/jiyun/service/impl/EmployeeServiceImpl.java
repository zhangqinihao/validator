package cn.jiyun.service.impl;

import cn.jiyun.pojo.Employee;
import cn.jiyun.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void add(  Employee employee) {

        //业务逻辑
        System.out.println("员工添加成功");


    }
}
