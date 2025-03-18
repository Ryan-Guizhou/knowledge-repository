package com.peach.cn.strategy;

/**
 * @Author Mr Shu
 * @Version 1.0.0
 * @Description //TODO
 * @CreateTime 2025/3/18 16:52
 */
public class OssFileStoreService extends FileStoreStrategy{
    @Override
    protected void uploadFile(String filePath) {
        System.out.println(String.format("oss上传文件,文件地址为:%s",filePath));
    }

    @Override
    protected String downloadFile(String filePath) {
        System.out.println("oss下载文件");
        return null;
    }
}
