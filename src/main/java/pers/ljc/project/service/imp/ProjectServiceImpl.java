package pers.ljc.project.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ljc.project.mapper.EmpMapper;
import pers.ljc.project.mapper.ProjectMapper;
import pers.ljc.project.pojo.Emp;
import pers.ljc.project.pojo.Project;
import pers.ljc.project.service.EmpService;
import pers.ljc.project.service.ProjectService;
import pers.ljc.project.util.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Result insertProject(Project project) {
        Result result = new Result();
        int i = 0;
        try {
            i = projectMapper.insertProject(project);
        } catch (Exception e) {
            return result.fail();
        }
        if (i != 0) result.success();
        return result;
    }

    @Override
    public Result listProjectsByPage(int pageNum, int size) {
        int start = (pageNum - 1) * size;
        List<Project> projectList = null;
        projectList = projectMapper.listProjectsByPage(start, size);
        Result result = new Result();
        if (projectList != null) {
            result.success(projectList);
        }
        return result;
    }

    @Override
    public Result countProject() {
        Result result = new Result();
        int i = projectMapper.countProject();
        result.success(i);
        return result;
    }

    @Override
    public Result getProjectByProjId(int projId) {
        Result result = new Result();
        Project project = null;
        project = projectMapper.getProjectByProjId(projId);
        if (project != null){
            result.success(project);
        }
        return result;
    }

    @Override
    public Result insertProjectEmpByProjId(int projId, String[] empNo) {
        int j = 0;
        int flag = 0;
        Result result = new Result();
        result.success(1);
        if (empNo == null){
            return result;
        }
        List<Emp> empList = empMapper.listEmpsByProjId(projId);
        for (int i = 0;i < empNo.length;i++){
            flag = 0;
            for (int n = 0;n < empList.size();n++){
                if (empNo[i].equals(empList.get(n).getEmpNo())){
                    flag = 1;
                }
            }
            if (flag == 0){
                projectMapper.insertProjectEmpByProjId(projId, empNo[i]);
            }
            if (j == 0){
                result.fail();
            }
        }
        return result;
    }

    @Override
    public Result updateProjectByProjId(Project project) {
        Result result = new Result();
        int i = projectMapper.updateProjectByProjId(project);
        if (i != 0){
            result.success(i);
        }
        return result;
    }

    @Override
    public Result deleteEmpForProject(int projId, String[] empNo) {
        Result result = new Result();
        result.success(1);
        if (empNo == null){
            return result;
        }
        for (int i = 0;i < empNo.length;i++){
            int j = projectMapper.deleteEmpForProject(projId, empNo[i]);
            if (j == 0){
                result.fail();
            }
        }
        return result;
    }

    @Override
    public Result deleteProjectByProjId(int projId) {
        Result result = new Result();
        int i = 0;
        try {
            i = projectMapper.deleteProjectByProjId(projId);
        } catch (Exception e) {
            return result.fail();
        }
        if (i != 0){
            result.success(i);
        }
        return result;
    }
}
