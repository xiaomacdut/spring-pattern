package com.xiaomacdut.pattern_proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * https://www.cnblogs.com/fengmingyue/p/6092151.html
 * Created by Tom on 2018/3/10.
 */
public class ProxyTest {

    public static void main(String[] args) {
        
        // 真实角色
        StarInterface realStar = new RealStar();
        // 处理器
        InvocationHandler handler = new StarHandler(realStar);
        // Proxy.newProxyInstance返回的是一个实现类，该类实现了StarInterface
        // proxy是代理对象
        StarInterface proxy = (StarInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{StarInterface.class},
                handler);
        proxy.sing();// 无论调用代理对象的什么方法，它都是在调用InvocationHandler的invoke()方法！
    }

}
