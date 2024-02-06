package com.example.logingpage.Service;

import com.example.logingpage.Model.Admin;
import com.example.logingpage.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public String addAdmin(int adminId, String name, String password) {
        // Implementation to add a new admin
        return "Admin added successfully";
    }
}
