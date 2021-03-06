package com.xiaoma.mall.controller;

import com.xiaoma.mall.entity.Good;
import com.xiaoma.mall.service.GoodService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("good")
public class GoodController {

    @Autowired
    private GoodService goodService;
    //获取商品列表
    //接口改造先从 Controller 入口开始改-->在改Service-->接着改实现Service类-->最后改Dao数据库操作层&&Mapper.XML
    @GetMapping("getList")
    public List<JSONObject> getList(){
        return goodService.getList();
    }
    /**
     * 商品文件上传接口
     */
    @PostMapping("shelves")
    public String shelves(MultipartFile file){
        if(file==null){
            return "error";
        }
        // suffixIndex ：返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
        int suffixIndex = file.getOriginalFilename().lastIndexOf(".");
        //suffix:==> substring(index) 方法返回index到最后的字符串。
        String suffix = file.getOriginalFilename().substring(suffixIndex);

        try{
            //将上传得文件做md5加密，获取位的MD值
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(file.getBytes());
            String md5name = new BigInteger(md.digest()).toString(16);
            //path文件路径，md5值昨晚文件名称
            Path path = Paths.get("D:/demo/"+md5name+suffix);
            //保存文件
            Files.write(path,file.getBytes());

            //保存得数据库
            Good good= new Good();
            good.setImage(md5name+suffix);
            goodService.add(good);


        }catch (IOException e){
            e.printStackTrace();
            return "error";
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return "ok";
    }
    /**
     * 获取图片
     *
     * @param imgName 图片名称
     * @param response 响应对象
     */
    @GetMapping("getGoodImg/{imgName}")
    public  void getGoodImg(@PathVariable("imgName") String imgName, HttpServletResponse response){

        //io流读取本地绝对路径
        Path path = Paths.get("D:/demo/"+imgName);
        try{
            byte[]  img = Files.readAllBytes(path);
            //组装响应头
            response.setContentType("image/png".concat(";charste=UTF-8"));
            response.setHeader("Content-Disposition","inline;filename="+imgName.split("\\.")[0]+"");
            //将图片字节写到响应输出流
            ServletOutputStream servletOutputStream =response.getOutputStream();
            servletOutputStream.write(img);
            //将流输出并且关闭流
            servletOutputStream.flush();
            servletOutputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
