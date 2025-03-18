package com.peach.cn.singleton;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 16:38
 */
public class InnerClassSingleton {


    static {
        System.out.println("outer class static block");
    }


    private InnerClassSingleton() {

    }

    static class InnerClass {

        static {
            System.out.println("inner class static block");
        }

        private InnerClass() {

        }

        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
