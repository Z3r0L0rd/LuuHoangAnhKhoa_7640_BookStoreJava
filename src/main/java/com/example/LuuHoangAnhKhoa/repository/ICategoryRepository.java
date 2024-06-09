package com.example.LuuHoangAnhKhoa.repository;

import com.example.LuuHoangAnhKhoa.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
