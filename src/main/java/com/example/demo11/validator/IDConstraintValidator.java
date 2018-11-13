package com.example.demo11.validator;



import com.example.demo11.validator.annotation.IDValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class IDConstraintValidator implements ConstraintValidator<IDValidator,String> {

    @Override
    public void initialize(IDValidator constraintAnnotation) {

    }

    @Override
    public boolean isValid(String id, ConstraintValidatorContext constraintValidatorContext) {
        int length = id.length();
        //直接使用身份证号码的正则表达式:
        //身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X,x
        //15位或18位的正则表达式为:
        //^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2}$
        //下面的是18位的身份证验证:
        if(id.matches("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$")){
            return true;
        }
        //否则不予通过
        return false;
    }
}
