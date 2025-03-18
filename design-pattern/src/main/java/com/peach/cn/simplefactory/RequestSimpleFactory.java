package com.peach.cn.simplefactory;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 17:28
 */
public class RequestSimpleFactory {

    private RequestSimpleFactory(){

    }

    public static RequestAbstract getInstance(String type){
        switch (type){
            case "DeepSeek":
                return new DeepseekRequest();
            case "GPT":
                return new GptRequest();
            case "TongYi":
                return new TongYiRequest();
            default:
                return null;
        }
    }
}
