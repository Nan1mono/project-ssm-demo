package pers.ljc.project.pojo;

public class Project {
    private int projId;                 // 项目编号
    private String projName;            // 项目名称
    private String projVersion;         // 项目版本
    private String projDesc;            // 项目说明
    private String projCreated;         // 启动时间
    private int projStatus;             // 项目状态 1正常 2暂停 3结束

    public Project() {
    }

    public Project(int projId, String projName, String projVersion, String projDesc, String projCreated, int projStatus) {
        this.projId = projId;
        this.projName = projName;
        this.projVersion = projVersion;
        this.projDesc = projDesc;
        this.projCreated = projCreated;
        this.projStatus = projStatus;
    }

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjVersion() {
        return projVersion;
    }

    public void setProjVersion(String projVersion) {
        this.projVersion = projVersion;
    }

    public String getProjDesc() {
        return projDesc;
    }

    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public String getProjCreated() {
        return projCreated;
    }

    public void setProjCreated(String projCreated) {
        this.projCreated = projCreated;
    }

    public int getProjStatus() {
        return projStatus;
    }

    public void setProjStatus(int projStatus) {
        this.projStatus = projStatus;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projId=" + projId +
                ", projName='" + projName + '\'' +
                ", projVersion='" + projVersion + '\'' +
                ", projDesc='" + projDesc + '\'' +
                ", projCreated='" + projCreated + '\'' +
                ", projStatus=" + projStatus +
                '}';
    }
}
