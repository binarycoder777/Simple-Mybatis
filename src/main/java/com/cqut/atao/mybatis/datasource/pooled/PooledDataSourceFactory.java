package com.cqut.atao.mybatis.datasource.pooled;

import com.cqut.atao.mybatis.datasource.unpooled.UnpooledDataSourceFactory;

import javax.sql.DataSource;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName PooledDataSourceFactory.java
 * @Description 有连接池的数据源工厂
 * @createTime 2022年09月26日 14:19:00
 */
public class PooledDataSourceFactory extends UnpooledDataSourceFactory {

    @Override
    public DataSource getDataSource() {
        PooledDataSource pooledDataSource = new PooledDataSource();
        pooledDataSource.setDriver(props.getProperty("driver"));
        pooledDataSource.setUrl(props.getProperty("url"));
        pooledDataSource.setUsername(props.getProperty("username"));
        pooledDataSource.setPassword(props.getProperty("password"));
        return pooledDataSource;
    }

}

