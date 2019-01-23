//package com.yr.config;
//
//import java.util.Map;
//
//import javax.persistence.EntityManager;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration // 注册到springboot容器中 -- 扫描xml(配置文件)
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactorySecondary",//配置连接工厂 entityManagerFactory
//        transactionManagerRef = "transactionManagerSecondary", //配置 事物管理器  transactionManager
//        basePackages = {"com.yr.dao2"}//设置Dao (Repository) 所在位置
//)
//public class DataSourceConfig2 {
//	
//	@Autowired
//    private JpaProperties jpaProperties;
//	
//	@Autowired
//    @Qualifier("secondaryDataSource")
//    private DataSource secondaryDataSource;
//	
//	@Bean(name = "secondaryDataSource") // 装配该方法返回值为 primaryDataSource 管理 bean
////    @Qualifier("secondaryDataSource") // spring 装配 bean唯一标识  -- 使用@Qualifier注解并且设置内容，是为了防止注入时冲突问题
//    @ConfigurationProperties(prefix = "spring.datasource.secondary") // 配置文件内 数据源的前缀
//    public DataSource primaryDatasource() {
//    	System.err.println("secondary db built");
//        return DataSourceBuilder.create().build();
//    }
//	
//    @Bean(name = "entityManagerSecondary")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
//        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
//    }
//	
//	private Map<String, String> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
//    }
//	
//	@Bean(name = "entityManagerFactorySecondary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
//        return builder
//                //设置数据源
//                .dataSource(secondaryDataSource)
//                //设置数据源属性
//                .properties(getVendorProperties(secondaryDataSource))
//                //设置实体类所在位置.扫描所有带有 @Entity 注解的类
//                .packages("com.yr.entity")
//                // Spring会将EntityManagerFactory注入到Repository之中.有了 EntityManagerFactory之后,
//                // Repository就能用它来创建 EntityManager 了,然后 EntityManager 就可以针对数据库执行操作
//                .persistenceUnit("primaryPersistenceUnit")
//                .build();
//    }
//	
//}
