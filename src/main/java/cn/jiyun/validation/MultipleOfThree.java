package cn.jiyun.validation;


import cn.jiyun.validation.validator.MultipleOfThreeForInteger;
import cn.jiyun.validation.validator.MultipleOfThreeForList;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {MultipleOfThreeForInteger.class, MultipleOfThreeForList.class})
public @interface MultipleOfThree {
    String message() default "必须是 3 的倍数";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
