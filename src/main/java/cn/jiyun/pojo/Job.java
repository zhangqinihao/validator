package cn.jiyun.pojo;

import cn.jiyun.validation.MultipleOfThree;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Job {

    /*
    * 注解一般不会管null得情况 需要加 @NotNull
    *
    *同一个注解可以对多种参数类型生效
    * */

    /*加入现在有这么一个场景
     *  1、对于 Integer 而言，必须是 3 的倍数
     *  2、对于 List 而言，list 中的元素个数，必须是 3 的倍数
     *
     *
     *  准备写一个注解，去实现  “3 的倍数“ 的验证
     *  这个注解支持两种数据类型 Integer、List*/
    @MultipleOfThree  //自定义注解
    private Integer id;
    @Size(min = 1)
    private String name;

    @MultipleOfThree
    @Size(min = 1) //参数不为空得情况下才回去验证
    @NotNull
    private List<String> labels;


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

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}


