package pers.ljc.project.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ljc.project.mapper.EmpMapper;
import pers.ljc.project.pojo.Emp;
import pers.ljc.project.service.EmpService;
import pers.ljc.project.util.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Result insertEmp(Emp emp) {
        Result result = new Result();
        int i = 0;
        try {
            i = empMapper.insertEmp(emp);
        } catch (Exception e) {
            return result.fail();
        }
        if (i != 0) result.success();
        return result;
    }

    @Override
    public Result listEmpsByPage(int pageNum, int size) {
        int start = (pageNum - 1) * size;
        List<Emp> empList = null;
        empList = empMapper.listEmpsByPage(start, size);
        Result result = new Result();
        if (empList != null){
            result.success(empList);
        }
        return result;
    }

    @Override
    public Result listEmpsByProjId(int projId) {
        List<Emp> empList = null;
        empList = empMapper.listEmpsByProjId(projId);
        Result result = new Result();
        if (empList != null){
            result.success(empList);
        }
        return result;
    }

    @Override
    public Result countEmp() {
        int i = empMapper.countEmp();
        Result result = new Result();
        result.success(i);
        return result;
    }

    @Override
    public Result listEmps() {
        Result result = new Result();
        List<Emp> empList = null;
        empList = empMapper.listEmps();
        if (empList != null){
            result.success(empList);
        }
        return result;
    }

    @Override
    public Result deleteEmpByEmpNo(String empNo) {
        Result result = new Result();
        int i = empMapper.deleteEmpByEmpNo(empNo);
        if (i != 0){
            result.success(i);
        }
        return result;
    }
}
