package com.example.LuuHoangAnhKhoa.validator.annotation;

import com.example.LuuHoangAnhKhoa.validator.ValidCategoryIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
@Documented
public @interface ValidCategoryId {
    String message() default "Invalid Category ID";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
