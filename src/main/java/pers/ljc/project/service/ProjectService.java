package pers.ljc.project.service;

import pers.ljc.project.pojo.Project;
import pers.ljc.project.util.Result;

import java.util.List;
import java.util.Map;

public interface ProjectService {
    /**
     * 插入一个项目
     * 成功返回resultCode:1 失败resultCode:0
     */
    Result insertProject(Project project);

    /**
     * 分页查询project 成功返回集合 失败返回Null
     */
    Result listProjectsByPage(int pageNum, int size);

    /**
     * 查询项目的总数
     */
    Result countProject();

    /**
     * 根据项目id查询项目
     */
    Result getProjectByProjId(int projId);

    /**
     * 添加项目的参与人员
     */
    Result insertProjectEmpByProjId(int projId, String[] empNo);

    /**
     * 根据项目id更新项目的信息
     */
    Result updateProjectByProjId(Project project);

    /**
     * 根据项目id和成员no删除参与项目的人
     */
    Result deleteEmpForProject(int projId, String[] empNo);

    /**
     * 根据projId删除Project
     */
    Result deleteProjectByProjId(int projId);
}
