package com.huowolf.util;

import com.deepoove.poi.XWPFTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author huowolf
 * @date 2019/4/10
 * @description
 */
public class DownloadUtil {

    /**
     * @param xwpfTemplate
     * @param response HttpServletResponse  写入response
     * @param returnName 返回的文件名
     */
    public static void download(XWPFTemplate xwpfTemplate, HttpServletResponse response, String returnName) throws IOException {
        response.setContentType("application/msword");
        response.setHeader("Content-Disposition", "attachment; filename=" + new String(returnName.getBytes("gbk"), "ISO-8859-1"));
        OutputStream outputstream = response.getOutputStream();         //取得输出流
        xwpfTemplate.write(outputstream);                               //写到输出流
        xwpfTemplate.close();                                           //关闭
        outputstream.flush();                                           //刷数据
        outputstream.close();
    }
}