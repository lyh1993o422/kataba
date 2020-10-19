package com.qfedu.kataba.core.type;

/**
 * 枚举类型，标记多个结果值，也可以用常量代替
 */
public enum RType {

    成功(1),失败(2),登陆失败(3);

    private int val;

    public int getVal(){
        return val;
    }

    private RType(int v){
        val =v;
    }
}
