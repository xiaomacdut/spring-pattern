package com.xiaomacdut.pattern_proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaomacdut
 * @date 2019年4月7日 下午6:53:36
 */
public class StarHandler implements InvocationHandler{
    
    private StarInterface realStar;// 真实角色
    
    // 通过构造器来初始化真实角色
    public StarHandler(StarInterface realStar){
        super();
        this.realStar = realStar;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object [] args) throws Throwable{
        Object object = null;
        System.out.println("真实角色调用之前的处理.....");
        if(method.getName().equals("sing")){
            object = method.invoke(realStar, args);// 激活调用的方法
        }
        System.out.println("真实角色调用之后的处理.....");
        return object;
    }
}
