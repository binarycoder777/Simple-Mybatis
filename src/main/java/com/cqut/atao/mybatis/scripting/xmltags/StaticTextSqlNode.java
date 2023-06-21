package com.cqut.atao.mybatis.scripting.xmltags;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName StaticTextSqlNode.java
 * @Description 静态文本SQL节点
 * @createTime 2023年06月21日 17:08:00
 */
public class StaticTextSqlNode implements SqlNode{

    private String text;

    public StaticTextSqlNode(String text) {
        this.text = text;
    }

    @Override
    public boolean apply(DynamicContext context) {
        //将文本加入context
        context.appendSql(text);
        return true;
    }

}
