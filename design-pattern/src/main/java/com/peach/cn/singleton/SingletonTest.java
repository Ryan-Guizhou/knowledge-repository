package com.peach.cn.singleton;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 16:14
 */
public class SingletonTest {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton singleton = EagerSingleton.getInstance();
        System.out.println("eagerSingleton.equals(singleton) = " + eagerSingleton.equals(singleton));

        InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();

    }
}
