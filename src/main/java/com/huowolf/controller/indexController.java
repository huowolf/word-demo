package com.huowolf.controller;

import com.deepoove.poi.XWPFTemplate;
import com.huowolf.dto.SubSidy;
import com.huowolf.util.DownloadUtil;
import com.sun.deploy.net.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huowolf
 * @date 2019/4/10
 * @description
 */
@RestController
@RequestMapping("/")
public class indexController {

    @RequestMapping("/subsidy")
    public void subsidy(HttpServletResponse response){

        SubSidy subSidy = new SubSidy();
        subSidy.setYear("2019");
        subSidy.setNo("110");
        subSidy.setName("郑志锋");
        subSidy.setDepartment("工会");
        subSidy.setMoney("2000");

        XWPFTemplate template = XWPFTemplate.compile("src/main/resources/补助.docx").render(subSidy);

        try {
            DownloadUtil.download(template,response,"补助慰问申领表.docx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
