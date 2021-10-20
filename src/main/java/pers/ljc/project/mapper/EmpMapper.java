package pers.ljc.project.mapper;

import pers.ljc.project.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    int insertEmp(Emp emp);
    List<Emp> listEmpsByPage(int pageNum, int size);
    List<Emp> listEmpsByProjId(int projId);
    int countEmp();
    List<Emp> listEmps();
    int deleteEmpByEmpNo(String empNo);
}
