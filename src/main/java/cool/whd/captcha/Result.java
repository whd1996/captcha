package cool.whd.captcha;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
@EqualsAndHashCode(callSuper = true)
@Data
public class Result extends HashMap<String,Object> {
    public static final String CODE_TAG = "code";
    public static final String MSG_TAG = "msg";
    public static final String DATA_TAG = "data";
    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";
    public static final String ERROR = "error";
    public static final String WARN = "warn";
    public static final String INFO = "info";

    public static final int SUCCESS_CODE = 200;
    public static final int FAIL_CODE = 400;
    public static final int ERROR_CODE = 500;
    public static final int WARN_CODE = 300;
    public static final int INFO_CODE = 100;
    public static final int UNKNOWN_CODE = 0;
    public static final String SUCCESS_MSG = "操作成功";
    public static final String FAIL_MSG = "操作失败";
    public static final String ERROR_MSG = "操作异常";
    public static final String WARN_MSG = "操作警告";
    public static final String INFO_MSG = "操作提示";
    public static final String UNKNOWN_MSG = "未知操作";
    public static final String DEFAULT_MSG = "操作默认";
    public static final String DEFAULT_DATA = "操作默认";
    public static final String DEFAULT_CODE = "0";
    public static final String DEFAULT_STATUS = "success";

    public Result() {
        put(CODE_TAG, UNKNOWN_CODE);
        put(MSG_TAG, UNKNOWN_MSG);
        put(DATA_TAG, DEFAULT_DATA);
        put("status", DEFAULT_STATUS);
    }

    public static Result success() {
        return new Result();
    }

    public static Result success(Object data) {
        return success(SUCCESS_MSG, data);
    }

    public static Result success(String msg, Object data) {
        return fail(msg, data);
    }

    public static Result fail() {
        return new Result();
    }

    public static Result fail(Object data) {
        Result result = new Result();
        result.put(DATA_TAG, data);
        return result;
    }

    public static Result fail(String msg, Object data) {
        Result result = new Result();
        result.put(CODE_TAG, FAIL_CODE);
        result.put("status", FAIL);
        result.put(MSG_TAG, msg);
        result.put(DATA_TAG, data);
        return result;
    }

    public static Result error() {
        return new Result();
    }

    public static Result error(Object data) {
        return fail(data);
    }

    public static Result error(String msg, Object data) {
        return fail(msg, data);
    }


    public static Result warn() {
        return new Result();
    }



}
