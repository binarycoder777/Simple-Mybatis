package com.cqut.atao.mybatis.binding;

import com.cqut.atao.mybatis.mapping.MappedStatement;
import com.cqut.atao.mybatis.mapping.SqlCommandType;
import com.cqut.atao.mybatis.session.Configuration;
import com.cqut.atao.mybatis.session.SqlSession;

import java.lang.reflect.Method;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName MapperMethod.java
 * @Description 映射器方法
 * @createTime 2022年09月24日 23:25:00
 */
public class MapperMethod {

    private final SqlCommand command;

    public MapperMethod(Class<?> mapperInterface, Method method, Configuration configuration) {
        this.command = new SqlCommand(configuration, mapperInterface, method);
    }

    public Object execute(SqlSession sqlSession, Object[] args) {
        Object result = null;
        switch (command.getType()) {
            case INSERT:
                break;
            case DELETE:
                break;
            case UPDATE:
                break;
            case SELECT:
                result = sqlSession.selectOne(command.getName(), args);
                break;
            default:
                throw new RuntimeException("Unknown execution method for: " + command.getName());
        }
        return result;
    }

    /**
     * SQL 指令
     */
    public static class SqlCommand {

        private final String name;
        private final SqlCommandType type;

        public SqlCommand(Configuration configuration, Class<?> mapperInterface, Method method) {
            String statementName = mapperInterface.getName() + "." + method.getName();
            MappedStatement ms = configuration.getMappedStatement(statementName);
            name = ms.getId();
            type = ms.getSqlCommandType();
        }

        public String getName() {
            return name;
        }

        public SqlCommandType getType() {
            return type;
        }
    }


}
