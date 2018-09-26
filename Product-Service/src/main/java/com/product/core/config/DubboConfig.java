package com.product.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource(locations= {"classpath:dubbo/*.xml"})
public class DubboConfig {

}

/*  @Bean
	    public ApplicationConfig applicationConfig(){
	        ApplicationConfig applicationConfig = new ApplicationConfig();
	        applicationConfig.setName("Product-Service");
	        return applicationConfig;
	    }

	    @Bean
	    public RegistryConfig registryConfig(){
	        RegistryConfig registryConfig = new RegistryConfig();
	        registryConfig.setAddress("192.168.200.151:2181,192.168.200.153:2181,192.168.200.150:2181");
	        return registryConfig;
	    }
        
	    
	    
 *//**默认就是dubbo协议，可以不用配置此Bean*//*
	    @Bean    
	    public ProtocolConfig protocolConfig(){
	        ProtocolConfig protocolConfig = new ProtocolConfig();
	        protocolConfig.setName("dubbo");
	        protocolConfig.setPort(20882);
	        return protocolConfig;
	    }
  */