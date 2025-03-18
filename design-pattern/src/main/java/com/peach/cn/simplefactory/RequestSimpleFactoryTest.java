package com.peach.cn.simplefactory;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description 简单工厂模式 + 模板方法模式
 * @CreateTime 2025/3/18 17:30
 */
public class RequestSimpleFactoryTest {

    public static void main(String[] args) {
        RequestAbstract request = RequestSimpleFactory.getInstance("GPT");
        String response = request.request();
        System.out.println(response);

    }
}
