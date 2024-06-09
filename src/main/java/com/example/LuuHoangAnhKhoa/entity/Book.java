package com.example.LuuHoangAnhKhoa.entity;

import com.example.LuuHoangAnhKhoa.validator.annotation.ValidCategoryId;
import com.example.LuuHoangAnhKhoa.validator.annotation.ValidUserId;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.apache.logging.log4j.message.Message;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @Size(max= 50, message = "Title must be less than 50 characters")
    @NotNull(message = "Tilte must be not null")
    private String title;

    @Column(name="author", length = 50)
    @Size(max = 50, message = "Author must be less than 50 characters")
    private String author;

    @Column(name="price")
    @NotNull(message="Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @ManyToOne
    @JoinColumn(name="category_id", referencedColumnName = "id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;
}
