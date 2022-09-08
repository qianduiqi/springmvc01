package com.itheima.domain;

import java.util.Date;

public class Group {
    private Integer deptId;
    private Integer id;
    private String name;
    private Dept dept;
    private Date birth;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

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

    @Override
    public String toString() {
        return "Group{" +
                "deptId=" + deptId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", birth=" + birth +
                '}';
    }
}
