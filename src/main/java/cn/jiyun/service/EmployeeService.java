package cn.jiyun.service;

import cn.jiyun.pojo.Employee;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
@Validated
public interface EmployeeService {

    public void add(@Valid Employee employee);

}
