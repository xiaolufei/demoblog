package com.xiaoma.demoblog.requstVo;


/**
 * 交易结果
 */
public class TransactionResult {

    private boolean success;

    private String errorCode;

    private String errorMessage;

    private Object resultData;
 

    public TransactionResult(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        success = false;
    }
    
    
    public TransactionResult(String errorCode, String errorMessage, Object resultData) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.resultData = resultData;
        success = false;
    }

    public TransactionResult(Object resultData) {
        success = true;
        this.resultData = resultData;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Object getResultData() {
        return resultData;
    }
}
