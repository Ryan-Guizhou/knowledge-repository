package com.peach.cn.simplefactory;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 17:22
 */
public abstract class RequestAbstract {

    protected abstract String getMethodName();

    protected abstract String getToken();

    protected abstract String buildParam();

    protected abstract String getUrl();

    public String request() {
        String url = getUrl();
        String token = getToken();
        String param = buildParam();
        return doPost(url,token,param);
    }


    private String doPost(String url,String token,String param) {
        return String.format("%s ,发起请求,请求地址:[%s],请求token:[%s],请求参数:[%s]",getMethodName(),url,token,param);
    }
}
