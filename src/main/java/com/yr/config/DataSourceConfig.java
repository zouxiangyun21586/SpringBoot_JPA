package com.yr.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 读取数据源(数据源的配置)
 * 
 * @author zxy-un
 * 
 * 2018年7月17日 下午3:28:12
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "primaryDataSource") // 装配该方法返回值为 primaryDataSource 管理 bean
    @Primary // 配置该数据源为主数据源 -- @Primary配置了数据源为主数据源，当没有配置自动切换的package时默认使用该数据源进行数据处理操作
    @Qualifier("primaryDataSource") // spring 装配 bean唯一标识  -- 使用@Qualifier注解并且设置内容，是为了防止注入时冲突问题
    @ConfigurationProperties(prefix = "spring.datasource.primary") // 配置文件内 数据源的前缀
    public DataSource primaryDatasource() {
    	System.err.println("primary db built--------");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondaryDataSource() {
    	System.err.println("secondary db built--------");
        return DataSourceBuilder.create().build();
    }


}