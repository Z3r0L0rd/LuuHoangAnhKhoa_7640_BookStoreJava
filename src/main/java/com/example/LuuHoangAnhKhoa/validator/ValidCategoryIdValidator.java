package com.example.LuuHoangAnhKhoa.validator;

import com.example.LuuHoangAnhKhoa.entity.Category;
import com.example.LuuHoangAnhKhoa.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
