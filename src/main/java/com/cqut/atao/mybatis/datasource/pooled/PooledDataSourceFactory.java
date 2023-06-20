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

    public PooledDataSourceFactory() {
        this.dataSource = new PooledDataSource();
    }

}

