package com.peach.cn.strategy;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 16:55
 */
public class FileStoreStrategyTest {

    private static final String PATH = "com.peach.cn";

    public static void main(String[] args) {
        FileStoreContext context = new FileStoreContext(new MongoFileStoreService());
        context.uploadFile(PATH);
        context.downloadFile(PATH);
    }
}
