package cn.jiyun.validation.validator;


import cn.jiyun.validation.MultipleOfThree;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class MultipleOfThreeForList implements ConstraintValidator<MultipleOfThree, List> {
    @Override
    public void initialize(MultipleOfThree constraintAnnotation) {

    }

    @Override
    public boolean isValid(List value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        return value.size() % 3 == 0;
    }
}
