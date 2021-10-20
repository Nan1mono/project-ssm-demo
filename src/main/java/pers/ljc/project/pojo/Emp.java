package pers.ljc.project.pojo;

public class Emp {
    private String empNo;                   // 员工编号
    private String empName;                 // 员工姓名
    private int empAge;                     // 员工年龄
    private String empBirth;                // 员工生日
    private String inductionTime;           // 入职时间
    private String empTel;                  // 员工电话
    private int empStatus;                  // 员工状态 1正常(默认) 2离职

    public Emp() {
    }

    public Emp(String empNo, String empName, int empAge, String empBirth, String inductionTime, String empTel, int empStatus) {
        this.empNo = empNo;
        this.empName = empName;
        this.empAge = empAge;
        this.empBirth = empBirth;
        this.inductionTime = inductionTime;
        this.empTel = empTel;
        this.empStatus = empStatus;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpBirth() {
        return empBirth;
    }

    public void setEmpBirth(String empBirth) {
        this.empBirth = empBirth;
    }

    public String getInductionTime() {
        return inductionTime;
    }

    public void setInductionTime(String inductionTime) {
        this.inductionTime = inductionTime;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public int getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(int empStatus) {
        this.empStatus = empStatus;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empBirth='" + empBirth + '\'' +
                ", inductionTime='" + inductionTime + '\'' +
                ", empTel='" + empTel + '\'' +
                ", empStatus=" + empStatus +
                '}';
    }
}
