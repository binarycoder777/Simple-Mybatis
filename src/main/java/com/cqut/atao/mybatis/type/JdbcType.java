package com.cqut.atao.mybatis.type;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName JdbcType.java
 * @Description JDBC类型枚举
 * @createTime 2022年09月26日 09:58:00
 */
public enum JdbcType {

    /**
     * int
     */
    INTEGER(Types.INTEGER),
    /**
     * float
     */
    FLOAT(Types.FLOAT),
    /**
     * double
     */
    DOUBLE(Types.DOUBLE),
    /**
     * decimal
     */
    DECIMAL(Types.DECIMAL),
    /**
     * varchar
     */
    VARCHAR(Types.VARCHAR),
    /**
     * timestamp
     */
    TIMESTAMP(Types.TIMESTAMP);

    public final int TYPE_CODE;
    private static Map<Integer,JdbcType> codeLookup = new HashMap<>();

    // 就将数字对应的枚举型放入 HashMap
    static {
        for (JdbcType type : JdbcType.values()) {
            codeLookup.put(type.TYPE_CODE, type);
        }
    }

    JdbcType(int code) {
        this.TYPE_CODE = code;
    }

    public static JdbcType forCode(int code)  {
        return codeLookup.get(code);
    }

}
