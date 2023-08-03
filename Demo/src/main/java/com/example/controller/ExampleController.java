package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ExampleController {

    @GetMapping("/upload")
    public String showUploadForm() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
        // 处理上传的文件逻辑，这里可以保存文件到服务器或进行其他操作
        // 假设你的上传文件为CSV文件，并且包含两列数据：Name和Age
        // 这里为了简单起见，我们只将上传的文件名传递到展示界面
        model.addAttribute("fileName", file.getOriginalFilename());

        // 重定向到展示数据的界面
        return "redirect:/show?fileName=" + file.getOriginalFilename();
    }

    @GetMapping("/show")
    public String showDataPage(@RequestParam("fileName") String fileName, Model model) {
        // 这里可以根据上传的文件名，读取文件并将数据传递到Thymeleaf模板中进行展示
        // 假设你已经读取了CSV文件的数据，并将数据传递到peopleList列表中
        // 这里只为演示，我们只传递文件名
        model.addAttribute("fileName", fileName);

        return "show_data";
    }
}

