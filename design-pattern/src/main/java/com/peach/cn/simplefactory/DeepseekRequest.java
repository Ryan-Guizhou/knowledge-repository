package com.peach.cn.simplefactory;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 17:24
 */
public class DeepseekRequest extends RequestAbstract{
    @Override
    protected String getMethodName() {
        return "DeepSeek";
    }

    @Override
    protected String getToken() {
        return "获取token";
    }

    @Override
    protected String buildParam() {
        return "构建参数";
    }

    @Override
    protected String getUrl() {
        return "获取url地址";
    }

}
