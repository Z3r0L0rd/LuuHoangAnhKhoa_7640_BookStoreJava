package com.example.LuuHoangAnhKhoa.repository;

import com.example.LuuHoangAnhKhoa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
