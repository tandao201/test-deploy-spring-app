package com.btl.model;

public class ResponseClient {
    private int statusCode;
    private String statusMess;
    private Object data;

    public ResponseClient() {
    }

    public ResponseClient(int statusCode, String statusMess, Object data) {
        this.statusCode = statusCode;
        this.statusMess = statusMess;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMess() {
        return statusMess;
    }

    public void setStatusMess(String statusMess) {
        this.statusMess = statusMess;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseClient{" +
                "statusCode=" + statusCode +
                ", statusMess='" + statusMess + '\'' +
                ", data=" + data +
                '}';
    }
}
