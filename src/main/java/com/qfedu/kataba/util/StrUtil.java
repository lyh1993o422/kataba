package com.qfedu.kataba.util;

/**
 * projectName: kataba
 *
 * @author: 她似月儿不可及
 * time: 2020/10/19 17:39
 * description:
 */

public class StrUtil {

    /**
     * 校验是否为空
     * @param strs
     * @return true 非空  false 空
     */
    public static boolean checkNoEmpty(String... strs){
        boolean r = true;
        for (String s : strs) {
            if (s==null || s.length()==0){
                r =false;
                break;
                //                continue;//跳出本次循环 结束本次循环
//                break;//跳出当前最近的循环，结束最近的循环体
//                return ;//结束方法
            }
        }
        return r;
    }

}
