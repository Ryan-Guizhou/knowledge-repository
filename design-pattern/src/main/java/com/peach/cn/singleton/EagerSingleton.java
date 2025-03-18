package com.peach.cn.singleton;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description 单例模式(饿汉式)
 * @CreateTime 2025/3/18 16:10
 */
public class EagerSingleton {

    private static EagerSingleton INSTANCE = new EagerSingleton(); // 直接创建实例

    // 构造器私有，防止外部创建实例
    private EagerSingleton() {
        System.out.println("EagerSingleton创建了实例");
    }

    // 获取实例
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

}
