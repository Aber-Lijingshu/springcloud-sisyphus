package com.prometheus.sisyphus;


import com.prometheus.sisyphus.data.hbase.demo.Info;

/**
 * Created by wujun on 2017/04/22.
 *
 * @author wujun
 * @since 2017/04/22
 */
public class Test {

    public static void main(String args[]) {
        Info<String> i1 = new Info<String>();      // 泛型类型为String
        i1.getVar();
    }
}
