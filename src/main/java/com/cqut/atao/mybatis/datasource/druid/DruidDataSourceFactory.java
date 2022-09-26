package com.cqut.atao.mybatis.datasource.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.cqut.atao.mybatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DruidDataSourceFactory.java
 * @Description Druid 数据源工厂
 * @createTime 2022年09月26日 09:28:00
 */
public class DruidDataSourceFactory implements DataSourceFactory {

    private Properties props;

    @Override
    public void setProperties(Properties props) {
        this.props = props;
    }

    @Override
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(props.getProperty("driver"));
        dataSource.setUrl(props.getProperty("url"));
        dataSource.setUsername(props.getProperty("username"));
        dataSource.setPassword(props.getProperty("password"));
        return dataSource;
    }
}
