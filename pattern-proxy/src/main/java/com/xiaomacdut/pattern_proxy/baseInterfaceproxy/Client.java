package com.xiaomacdut.pattern_proxy.baseInterfaceproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaomacdut
 * @date 2020年2月18日 下午6:44:38
 */
public class Client{
    
    public static void main(String [] args){
        // 代理目标类
        final Producer producer = new Producer();
        
        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                new Class[]{IProducer.class}, new InvocationHandler(){
                    
                    /**
                     * 作用：执行被代理对象的任何接口方法都会经过该方法
                     * 方法参数的含义
                     * @param proxy   代理对象的引用
                     * @param method  当前执行的方法
                     * @param args    当前执行方法所需的参数
                     * @return        和被代理对象方法有相同的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object [] args) throws Throwable{
                        // 提供增强的代码
                        Object returnValue = null;
                        // 1.获取方法执行的参数
                        Float money = (Float) args[0];
                        // 2.判断当前方法是不是销售
                        if("saleProduct".equals(method.getName())){
                            returnValue = method.invoke(producer, money * 0.8f);
                        }
                        return returnValue;
                    }
                });
        
        proxyProducer.saleProduct(10000f);
    }
}
