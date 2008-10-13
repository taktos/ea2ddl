package jp.sourceforge.ea2ddl.dao.allcommon.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OutsideSql {
    boolean dynamicBinding() default false;
    boolean offsetByCursor() default false;
    boolean limitByCursor() default false;
}
