package com.peach.cn.singleton;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description 懒汉式单例模式
 * @CreateTime 2025/3/18 16:30
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     *  这种方式的懒汉式加载方式是存在问题的，因为instance可能在多线程的情况下被初始化多次，
     *  但是由于instance被声明为static的，所以instance在类加载的时候就会被初始化，
     *  所以instance在多线程的情况下可能被初始化多次，所以instance可能不是单例的。这种方式是不安全的，可以使用synchronized关键字、或者双检锁解决。
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 双检锁实现方式,通过两次判断加了一个synchronized关键字，保证线程安全。
     * @return
     */
    public static LazySingleton getInstanceDoubleCheck() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 直接通过synchronized关键字实现，但是效率较低。
     */
    public static synchronized LazySingleton getInstanceSynchronized() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
