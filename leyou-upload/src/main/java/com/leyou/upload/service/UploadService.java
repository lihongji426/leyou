package com.leyou.upload.service;

import org.springframework.web.multipart.MultipartFile; /**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface UploadService {
    /**
     * 图片上传
     * @param file
     * @return
     */
    String uploadImage(MultipartFile file);
}
