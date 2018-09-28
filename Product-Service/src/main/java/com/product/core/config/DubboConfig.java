package com.product.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * <h1>Dubbo配置</h1>
 * @author happy everyday
 * 2018年9月28日
 */
@Configuration
@ImportResource(locations= {"classpath:dubbo/*.xml"})
public class DubboConfig {

}
