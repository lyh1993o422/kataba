package com.qfedu.kataba.vo;

import com.qfedu.kataba.core.type.RType;
import lombok.Data;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 17:46
 * description: 统一结果返回 整个系统的 接口的统一返回格式
 */

@Data
public class R<T> {

    private int code;//返回码
    private String msg;//返回码的字符串信息
    private T data;//返回的数据

    public static <T> R setR(int c,String m,T obj){
        R r = new R();
        r.setCode(c);
        r.setData(obj);
        r.setMsg(m);
        return r;
    }

    //成功
    public static R ok(){
        return setR(RType.成功.getVal(),"OK",null);
    }
    //成功
    public static <T> R ok(T t){
        return setR(RType.成功.getVal(),"OK",t);
    }
    //失败
    public static R fail(){
        return setR(RType.失败.getVal(),"Fail",null);
    }

}
