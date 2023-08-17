package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 文件上传controller
 */
@Controller
public class FileUploadController {
    public SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/upload1")
    public ModelAndView getBook(){
        return new ModelAndView("/fileUpload");
    }


    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request){
        String format= dateFormat.format(new Date());
        //1.准备文件夹
        String realPath=request.getServletContext().getRealPath("/img")+format;
        File folder=new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        //2.准备文件名
        String oldName=file.getOriginalFilename();
        String newName= UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
        try {
            //3.存储
            //4.组装uel
            file.transferTo(new File(folder,newName));
            String url=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/img"+format+newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed";
    }

}
