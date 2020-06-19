package cn.jiyun.service;

import cn.jiyun.pojo.Department;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service

public class DepartmentService {


    public void add(@Valid Department department){

        System.out.println("部门添加成功");

    };


}
