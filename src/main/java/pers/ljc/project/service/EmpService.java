package pers.ljc.project.service;

import pers.ljc.project.pojo.Emp;
import pers.ljc.project.util.Result;

import java.util.List;
import java.util.Map;

public interface EmpService {
    /**
     * 插入员工 成功返回 resultCode:1 失败返回resultCode:0
     */
    Result insertEmp(Emp emp);

    /**
     * 分页查询emp 成功返回数据集合 失败返回Null
     */
    Result listEmpsByPage(int pageNum, int size);

    /**
     * 根据项目找出所有参与这个项目的员工
     */
    Result listEmpsByProjId(int projId);

    /**
     * 查询员工的总数
     */
    Result countEmp();

    /**
     * 查询所有员工
     */
    Result listEmps();

    /**
     * 根据empNo删除员工
     */
    Result deleteEmpByEmpNo(String empNo);
}
