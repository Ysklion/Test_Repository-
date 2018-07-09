package com.xqoa.model;

public class Result {
    private boolean success;

    private String description;

    private int code;

    private Object data;

    public Result setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Result setDescription(String description) {
        this.description = description;
        return this;
    }

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {

        return success;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public Result(boolean success, String description, int code, Object data) {
        this.success = success;
        this.description = description;
        this.code = code;
        this.data = data;
    }

    public Result() {

    }
}
