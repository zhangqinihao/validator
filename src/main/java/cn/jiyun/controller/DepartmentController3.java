package cn.jiyun.controller;

import cn.jiyun.pojo.Department;
import cn.jiyun.vo.ResultVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("department3")
@Validated //表示对本类中的方法开启验证功能
public class DepartmentController3 { //分组验证






    /**Valid 加全局处理异常
     * @param department
     * @return
     */
    @PostMapping("add3")
    public ResultVo add3(@RequestBody  @Valid  Department department){


        return  ResultVo.success();

    }


}
