package com.peach.cn.strategy;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description 文件上传服务定义抽象类 使用策略模式获取不同的文件存储类型
 * @CreateTime 2025/3/18 16:49
 */
public abstract class FileStoreStrategy {

    protected abstract void uploadFile(String filePath);

    protected abstract String downloadFile(String filePath);
}
