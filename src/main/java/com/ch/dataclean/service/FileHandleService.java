package com.ch.dataclean.service;

import com.ch.dataclean.common.page.Page;
import com.ch.dataclean.model.FileModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FileHandleService {
    /**
     * 文件上传
     */
    FileModel fileUpload(MultipartFile file, String deptId, String desc) throws Exception;

    /**
     * 获取文件列表
     * @return
     * @throws Exception
     */
    Page getFiles(String search, String pid, Page page) throws Exception;

    /**
     * 下载模板文件
     * @param deptId 部门id
     * @return
     * @throws Exception
     */
    ResponseEntity<byte[]> downloadTemplateFile(String deptId) throws Exception;

    Object testTrans();
    Object testJob();
}
