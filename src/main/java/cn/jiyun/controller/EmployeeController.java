package cn.jiyun.controller;

import cn.jiyun.pojo.Department;
import cn.jiyun.pojo.Employee;
import cn.jiyun.vo.ResultVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("employee")
@Validated
public class EmployeeController {


    @PostMapping("add3")
    public ResultVo add3(@RequestBody @Valid Employee employee){


        return  ResultVo.success();

    }




}
