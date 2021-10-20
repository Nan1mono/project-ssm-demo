package pers.ljc.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.ljc.project.pojo.Project;
import pers.ljc.project.service.ProjectService;
import pers.ljc.project.util.Result;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping("/insertProject")
    public Result insertProject(Project project){
        Result result = projectService.insertProject(project);
        return result;
    }

    @RequestMapping("/listProjectsByPage")
    public Result listProjectsByPage(int pageNum, int size){
        Result result = projectService.listProjectsByPage(pageNum, size);
        return result;
    }

    @RequestMapping("/countProject")
    public Result countProject(){
        Result result = projectService.countProject();
        return result;
    }

    @RequestMapping("/getProjectByProjId")
    public Result getProjectByProjId(int projId){
        Result result = projectService.getProjectByProjId(projId);
        return result;
    }

    @RequestMapping("/insertProjectEmpByProjId")
    public Result insertProjectEmpByProjId(int projId, String[] empNo){
        Result result = projectService.insertProjectEmpByProjId(projId, empNo);
        return result;
    }

    @RequestMapping("/updateProject")
    public Result updateProject(Project project, int projId, @RequestParam(required = false) String[] empNo){
        Result result = new Result();
        Result result1 = projectService.updateProjectByProjId(project);
        Result result2 = projectService.insertProjectEmpByProjId(projId, empNo);
        if (result1.getResultCode() == 1 && result2.getResultCode() == 1){
            result.success();
        }
        return result;
    }

    @RequestMapping("/deleteEmpForProject")
    public Result deleteEmpForProject(int projId, String[] empNo){
        Result result = new Result();
        result = projectService.deleteEmpForProject(projId, empNo);
        return result;
    }

    @RequestMapping("/deleteProjectByProjId")
    public Result deleteProjectByProjId(int projId){
        Result result = projectService.deleteProjectByProjId(projId);
        return result;
    }
}
