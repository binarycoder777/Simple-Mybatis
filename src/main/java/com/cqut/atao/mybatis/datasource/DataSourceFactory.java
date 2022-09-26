package com.cqut.atao.mybatis.datasource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DataSourceFactory.java
 * @Description 数据源工厂
 * @createTime 2022年09月26日 09:28:00
 */
public interface DataSourceFactory {

    void setProperties(Properties props);

    DataSource getDataSource();

}
