package com.cailei.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private Integer sal;
    private Integer comm;
    private Integer deptno;
}
