package cn.jiyun.controller;

import cn.jiyun.pojo.Job;
import cn.jiyun.vo.ResultVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("job")
@Validated
public class JobControlller {


    @PostMapping
    public ResultVo add(@RequestBody @Valid Job job){


        return  ResultVo.success();
    }







}
