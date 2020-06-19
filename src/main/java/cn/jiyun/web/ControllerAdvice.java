package cn.jiyun.web;

import cn.jiyun.enums.ErrorCode;
import cn.jiyun.vo.ResultVo;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintDeclarationException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.ControllerAdvice(basePackages ="cn.jiyun.controller" )//扫描所有controller
@ResponseBody //控制层用的 RestController
public class ControllerAdvice {


    /*自定义异常*/ //用于controller做参数抛异常
    @ExceptionHandler  //按照习惯不能每个controller都写一个捕获异常的方法 所以我们定义一个捕获所有controler的类
    public ResultVo exceptionHandler(MethodArgumentNotValidException/*校验错误信息*/ e){

        Map<String, String> map = e.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return ResultVo.fail(ErrorCode.PARAM_ERROR,map);

    }

    /*自定义异常*/ //用于service实现类做参数抛异常
    @ExceptionHandler  //按照习惯不能每个controller都写一个捕获异常的方法 所以我们定义一个捕获所有controler的类
    public ResultVo exceptionHandler(ConstraintViolationException/*校验错误信息*/ e){

        Map<Path, String> map = e.getConstraintViolations().stream()
                .collect(Collectors.toMap(ConstraintViolation::getPropertyPath, ConstraintViolation::getMessage));
        return ResultVo.fail(ErrorCode.PARAM_ERROR,map);

    }


    /*自定义异常*/ //用于抛以外得异常
    @ExceptionHandler  //按照习惯不能每个controller都写一个捕获异常的方法 所以我们定义一个捕获所有controler的类
    public ResultVo exceptionHandler(Exception/*校验错误信息*/ e){


        return ResultVo.fail(ErrorCode.System_ERROR);

    }

}
