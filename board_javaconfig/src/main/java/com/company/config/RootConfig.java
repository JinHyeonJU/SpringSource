package com.company.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//root-context.xml, task-config 대체하는 클래스

@EnableScheduling //<task:annotation-driven/>
@EnableTransactionManagement //<tx:annotation-driven/>
@MapperScan(basePackages = {"com.company.mapper"}) //	<mybatis-spring:scan base-package="com.company.mapper"/>
@ComponentScan(basePackages = {"com.company.service", "com.company.except", "com.company.task"}) //<context:component-scan base-package="com.company.service"/>
@Configuration
public class RootConfig {
	
	/*<!-- Hikari 커넥션 풀 -->
	<bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">
		<property name="driverClassName" value="oracle.jdbc.OracleDriver" />
		<property name="jdbcUrl" value="jdbc:oracle:thin:@localhost:1521:orcl" />
		<property name="username" value="javaDB" />
		<property name="password" value="12345" />
	</bean>

	<!-- 커넥션 풀을 위한 DataSource 설정 -->
	<bean id="ds" class="com.zaxxer.hikari.HikariDataSource" destroy-method="close">
		<constructor-arg ref="hikariConfig" />
	</bean>
	 */
	@Bean // == @Component, @Service, @Controller, @Respository = > 객체생성요청
	public DataSource dataSource() {
		HikariConfig hikari = new HikariConfig();
		hikari.setDriverClassName("oracle.jdbc.OracleDriver");
		hikari.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		hikari.setUsername("javaDB");
		hikari.setPassword("12345");

		HikariDataSource ds = new HikariDataSource(hikari);
		return ds;
	}

	/*<!-- mybatis -->
		<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
			<property name="dataSource" ref="ds"/>
		</bean>
	 */
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return sqlSessionFactory.getObject();		
	}
	
	/*<!-- 트랜잭션 -->
	<!-- 트랜잭션 관리 : 매니저 등록 -->
	<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<property name="dataSource" ref="ds"/>
	</bean>
	*/
	@Bean
	public DataSourceTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());		
	}
}
