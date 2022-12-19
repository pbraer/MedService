package com.example.MedService.controllers;

import com.example.MedService.dto.DoctorDto;
import com.example.MedService.dto.FileDto;
import com.example.MedService.service.DoctorService;
import com.example.MedService.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
//@RequestMapping("/")
public class DataControllers {



    //@PostMapping()
    //public void read(@RequestParam("emailInput") String email, @RequestParam("passwordInput") String password,
    //                 Model model) {


        // AccountDAO.придумать медот чтобы достать данные всех почт и паролей
        //этот метот по идее читаеть с консоли
        // здесь реализация авторизации

    //}

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private FileService fileService;

    @GetMapping(value = "/get-fio-list")
    @ResponseBody
    public List<DoctorDto> getListAccount(@RequestParam String someSpec) {
        return doctorService.getAccountsBySomeSpec(someSpec);
    }

    @GetMapping(value = "/profile")
    public String openProfilePage(Model model) {
        return "/profile";
    }

    @PostMapping(value = "upload-file",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public FileDto uploadFile(MultipartFile file) {
        fileService.save(file);
        return null;
    }

}
