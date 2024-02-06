package com.example.logingpage.Model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "admin")
@Data  //get set use cheyann
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int adminId;
    String name;
    String Password;

}
