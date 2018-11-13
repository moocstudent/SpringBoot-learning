package com.example.demo11.validator.annotation;

import com.example.demo11.validator.IDConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = {IDConstraintValidator.class})
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IDValidator {

    //提示信息
    String message() default "非正确的身份证格式.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
