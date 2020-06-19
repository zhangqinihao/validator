package cn.jiyun.controller;

import cn.jiyun.pojo.Employee;
import cn.jiyun.service.EmployeeService;
import cn.jiyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("employee2")
//@Validated 放在业务逻辑层做验证
public class EmployeeController2 {


    @Autowired
    EmployeeService employeeService;


    @PostMapping("add3")
    public ResultVo add3(@RequestBody /*@Valid*/ Employee employee){
        employeeService.add(employee);

        return  ResultVo.success();

    }




}
