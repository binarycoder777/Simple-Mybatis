package com.cqut.atao.mybatis.scripting.xmltags;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SqlNode.java
 * @Description SQL 节点
 * @createTime 2023年06月21日 16:53:00
 */
public interface SqlNode {

    boolean apply(DynamicContext context);

}
