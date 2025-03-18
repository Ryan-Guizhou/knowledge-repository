package com.peach.cn.singleton;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description 使用枚举类实现单例模式
 * @CreateTime 2025/3/18 16:23
 */
public enum EunmSingleton {

    INSTANCE;

    public static EunmSingleton getInstance(){
        return INSTANCE;
    }
}
