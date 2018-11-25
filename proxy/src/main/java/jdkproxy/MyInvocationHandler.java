package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author maj
 * @date 2018年8月25日 上午9:24:53
 */
public class MyInvocationHandler implements InvocationHandler{
    
    
    private Object target; // 目标类
    private Transaction transaction;
    
    /**
     * @param target
     * @param transaction
     */
    public MyInvocationHandler(Object target, Transaction transaction){
        super();
        this.target = target;
        this.transaction = transaction;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object [] args) throws Throwable{
        String methodName = method.getName();
        if("savePerson".equals(methodName) || "deletePerson".equals(methodName) || "updatePerson".equals(methodName)){
            this.transaction.beginTransaction(); // 开启事务
            method.invoke(target); // 调用目标方法
            this.transaction.commit(); // 提交事务
        }else{
            method.invoke(target);
        }
        return null;
    }
    
}
