package com.xqoa.model;

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result()
                .setSuccess(true)
                .setCode(ResultCode.SUCCESS)
                .setDescription(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result genSuccessResult(Object data) {
        return new Result()
                .setSuccess(true)
                .setCode(ResultCode.SUCCESS)
                .setDescription(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setSuccess(false)
                .setCode(ResultCode.FAIL)
                .setDescription(message);
    }
}
