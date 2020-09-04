package com.mooc.mettingfilm.backend_eureka_server;

import java.text.DecimalFormat;

/**
 *@Author 陈建
 *@Date 2020/9/4 17:17
 *Description
 */
public class Test {
    public static void main(String[] args) {
        DecimalFormat rootDf = new DecimalFormat("#.00");
        System.out.println(Double.parseDouble(rootDf.format(1 * 100)));
    }
}
