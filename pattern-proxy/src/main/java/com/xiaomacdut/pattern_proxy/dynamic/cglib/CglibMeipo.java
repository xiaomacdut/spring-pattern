package com.xiaomacdut.pattern_proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CglibMeipo implements MethodInterceptor{

    /**
     * https://blog.csdn.net/rain097790/article/details/14168785
     * 获取代理对象
     * @author xiaomacdut
     * @param clazz
     * @return
     * @throws Exception
     * @version 0.0.1
     * @since 0.0.1
     * @data 2018年11月25日 下午7:37:13
     */
    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        // 要把哪个设置为即将生成的新类父类
        // 新生成的类继承clazz
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
        
    }
    
    public Object intercept(Object o, Method method, Object [] objects, MethodProxy methodProxy) throws Throwable{
        // 业务的增强
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
        
        methodProxy.invokeSuper(o, objects);
        
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
    
    
}
