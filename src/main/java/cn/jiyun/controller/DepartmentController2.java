package cn.jiyun.controller;

import cn.jiyun.pojo.Department;
import cn.jiyun.service.DepartmentService;
import cn.jiyun.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("department2")
//@Validated //表示对本类中的方法开启验证功能 放在业务逻辑层做验证
public class DepartmentController2 {


    @Autowired
    private DepartmentService departmentService;


    /**添加部门 传统方式
     *http://localhost:8080/department
     *addRoot parent_id=0
     *add
     * @param department 要添加的部门
     * @return
     */
    @PostMapping
    public String add(@RequestBody Department department){

        /*
        * id  必须是null
        *
        * parent_id 不能为null 必须大于0
        *
        * name 不能为空 长度必须大于0
        *
        * createTime 肯定不能是未来时间
        *
        *
        *
        *
        * */

        if(department.getId()!=null){

            return  "id  必须是null";
        }
        if(department.getParentId()==null){

            return  "parent_id 不能为null";
        }
        if(department.getParentId()<0){

            return  "parent_id 必须大于0";
        }
        if(department.getName()==null || department.getName().equals("")){

            return  "name 不能为空";
        }

        if(department.getName().length()<=0){

            return  "name 长度必须大于0";
        }

        if(department.getCreateTime()==null){

           department.setCreateTime(LocalDateTime.now());

        }else if (department.getCreateTime().isAfter(LocalDateTime.now())){
            return  "createTime 肯定不能是未来时间";
        }


        return  "ok";

    }


    /** 加入 Valid
     * @param department
     * @return
     */
    @PostMapping("add2")
    public String add2(@RequestBody  @Valid  Department department){


        return  "ok";

    }


    /**Valid 加全局处理异常
     * @param department
     * @return
     */
    @PostMapping("add3")
    public ResultVo add3(@RequestBody  /*@Valid */ Department department){

        departmentService.add(department);
        return  ResultVo.success();

    }

   /* *//*自定义异常*//*
    @ExceptionHandler  //按照习惯不能每个controller都写一个捕获异常的方法 所以我们定义一个捕获所有controler的类
    public  ResultVo exceptionHandler( MethodArgumentNotValidException*//*校验错误信息*//* e){

        Map<String, String> map = e.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return ResultVo.fail(ErrorCode.PARAM_ERROR,map);

    }*/



}
