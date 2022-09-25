package com.cqut.atao.mybatis.mapping;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SqlCommandType.java
 * @Description SQL 指令类型
 * @createTime 2022年09月24日 23:58:00
 */
public enum SqlCommandType {

    /**
     * 未知
     */
    UNKNOWN,
    /**
     * 插入
     */
    INSERT,
    /**
     * 更新
     */
    UPDATE,
    /**
     * 删除
     */
    DELETE,
    /**
     * 查找
     */
    SELECT;

}
