package cn.jiyun.pojo;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;
import java.util.List;

/*
if(department.getId()!=null){

            return  "id  必须是null";
        }
        if(department.getParent_id()==null){

            return  "parent_id 不能为null";
        }
        if(department.getParent_id()<0){

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
*
* */


public class Department {
    /*
    主键id
    * */
    @Null(message = "id真的必须为空")
    private  Integer id;
    /*
    父类id
    * */
    @NotNull
    private  Integer parentId;
    /*
    * 部门名称
    * */
    @NotBlank
    private  String name;
    /*
    * 成立时间
    * */
    @NotNull(message = "成立时间不能为空")
    @PastOrPresent(message = "不能大于当前时间")
    private  LocalDateTime createTime;

    //级联验证
    private List< @Valid Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }




}
