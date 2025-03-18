package com.peach.cn.strategy;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 16:52
 */
public class FileStoreContext {

    private FileStoreStrategy fileStoreStrategy;

    public FileStoreContext(FileStoreStrategy fileStoreStrategy) {
        this.fileStoreStrategy = fileStoreStrategy;
    }

    public void uploadFile(String path){
        fileStoreStrategy.uploadFile(path);
    }

    public void downloadFile(String path){
        fileStoreStrategy.downloadFile(path);
    }

}
