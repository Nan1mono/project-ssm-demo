package pers.ljc.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.ljc.project.pojo.Emp;
import pers.ljc.project.service.EmpService;
import pers.ljc.project.util.Result;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/insertEmp")
    public Result insertEmp(Emp emp){
        Result result = empService.insertEmp(emp);
        return result;
    }

    @RequestMapping("/listEmpsByPage")
    public Result listEmpsByPage(int pageNum, int size){
        Result result = empService.listEmpsByPage(pageNum, size);
        return result;
    }

    @RequestMapping("/listEmpsByProjId")
    public Result listEmpsByProjId(int projId){
        Result result = empService.listEmpsByProjId(projId);
        return result;
    }

    @RequestMapping("/countEmp")
    public Result countEmp(){
        Result result = empService.countEmp();
        return result;
    }

    @RequestMapping("/listEmps")
    public Result listEmps(){
        Result result = empService.listEmps();
        return result;
    }

    @RequestMapping("/deleteEmpByEmpNo")
    public Result deleteEmpByEmpNo(String empNo){
        Result result = empService.deleteEmpByEmpNo(empNo);
        return result;
    }
}
