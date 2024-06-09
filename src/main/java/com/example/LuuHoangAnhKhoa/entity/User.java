package com.example.LuuHoangAnhKhoa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import com.example.LuuHoangAnhKhoa.validator.annotation.ValidUsername;
import org.apache.logging.log4j.message.Message;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", length = 50, nullable = false,unique = true)
    @NotBlank(message="Username is required")
    @Size(max=50 , message = "Username must be less than 50 characters")
    @ValidUsername
    private String username;

    @Column(name = "password", length = 250, nullable = false)
    @NotBlank(message = "Password is required")
    private String password;
    @Column(name = "email",length = 50)
    @Size(max = 50, message = "Email must be less than than 50 characters")
    @Email(message = "Email is required")
    private String email;

    @Column(name = "name", length = 50, nullable = false)
    @Size(max=50, message ="Your name must be less than 50 characters")
    @NotBlank(message = "Your name is required")
    private String name;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();
}
