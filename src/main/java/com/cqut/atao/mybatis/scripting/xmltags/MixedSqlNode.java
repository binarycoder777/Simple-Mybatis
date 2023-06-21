package com.cqut.atao.mybatis.scripting.xmltags;

import java.util.List;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName MixedSqlNode.java
 * @Description 混合SQL节点
 * @createTime 2023年06月21日 17:05:00
 */
public class MixedSqlNode implements SqlNode {

    //组合模式，拥有一个SqlNode的List
    private List<SqlNode> contents;

    public MixedSqlNode(List<SqlNode> contents) {
        this.contents = contents;
    }

    @Override
    public boolean apply(DynamicContext context) {
        // 依次调用list里每个元素的apply
        contents.forEach(node -> node.apply(context));
        return true;
    }

}

