package com.xiaomacdut.proxy.dynamic.cglib;

public class CglibTest {

    public static void main(String[] args) {

        try {
            ZhangSan obj = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
            obj.findLove();
            System.out.println("--------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
