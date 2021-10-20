package pers.ljc.project.mapper;

import pers.ljc.project.pojo.Project;

import java.util.List;

public interface ProjectMapper {
    int insertProject(Project project);
    List<Project> listProjectsByPage(int pageNum, int size);
    int countProject();
    Project getProjectByProjId(int projId);
    int insertProjectEmpByProjId(int projId, String empNo);
    int updateProjectByProjId(Project project);
    int deleteEmpForProject(int projId, String empNo);
    int deleteProjectByProjId(int projId);
}
