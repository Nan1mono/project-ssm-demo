package pers.ljc.project.util;

public class Result {
    private int resultCode = 0;
    private Object data;

    public Result() {
    }

    public Result(int resultCode) {
        this.resultCode = resultCode;
    }

    public Result(int resultCode, Object object) {
        this.resultCode = resultCode;
        this.data = object;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result success(){
        this.resultCode = 1;
        return new Result(resultCode);
    }

    public Result success(Object object){
        this.resultCode = 1;
        this.data = object;
        return new Result(resultCode,object);
    }

    public Result fail(){
        return new Result();
    }
}
