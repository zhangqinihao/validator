package cn.jiyun.pojo;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

public class Employee {
    @Null(message = "id需要是null")
    private Integer id;
    @NotEmpty(message = "名称不能为空")
    private String name;
    @Valid //级联验证 一对一  一对多
    private Department department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
