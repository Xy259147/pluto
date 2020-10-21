package com.hhdybb.pluto.core.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 自定义扫描注解类
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(PlutoAutoConfiguration.class)
@Documented
public @interface PlutoClassScanner {
}
