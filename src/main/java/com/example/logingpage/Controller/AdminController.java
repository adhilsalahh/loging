package com.example.logingpage.Controller;

import com.example.logingpage.Model.Admin;
import com.example.logingpage.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;


    @PostMapping("/add")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }





//    @PostMapping("/add")
//    public String addNewAdmin (@RequestParam ("adminId") int adminId,
//                      @RequestParam ("name")String name,
//                      @RequestParam ("password")String password){
//    return adminService.addAdmin( adminId,name,password);
//    }

}


