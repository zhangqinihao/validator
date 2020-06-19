package cn.jiyun.controller;

import cn.jiyun.pojo.Employee2;
import cn.jiyun.vo.ResultVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;

@RestController
@RequestMapping("employee3")
@Validated
public class EmployeeController3 { //分组认证


    @PostMapping("add3")                                              //不属于特殊组得声明默认组
    public ResultVo add3(@RequestBody @Validated({Employee2.Add.class, Default.class})/*表示当前检验add方法*/ Employee2 employee2){

        return  ResultVo.success();

    }
    @PutMapping("update")
    public ResultVo update(@RequestBody @Validated({Employee2.Update.class,Default.class})/*表示当前检验update方法*/ Employee2 employee2){


        return  ResultVo.success();

    }




}
