package cn.jiyun.pojo;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class Employee2 {


    public interface  Add{

    }
    public interface  Update{

    }

    /*
    * 如果指定了校验组，那么参数值校验属于校验组得
    *
    * 如果不指定 参数属于默认组 需要在参数中声明 见controller
    * */

                //可以加多个分组
    @Null( groups = {Add.class},message = "id需要是null")//走添加需要时null
                     //一个分组时不需要大括号
    @NotNull(groups = Update.class,message = "修改id不能是null") //走修改需要不是null
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
