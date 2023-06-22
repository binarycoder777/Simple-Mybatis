package com.cqut.atao.mybatis.executor.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ParameterHandler.java
 * @Description 参数处理器
 * @createTime 2023年06月22日 21:09:00
 */
public interface ParameterHandler {

    /**
     * 获取参数
     */
    Object getParameterObject();

    /**
     * 设置参数
     */
    void setParameters(PreparedStatement ps) throws SQLException;

}
