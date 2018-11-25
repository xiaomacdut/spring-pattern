package jdkproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * 测试类
 * @author maj
 * @date 2018年8月25日 上午9:30:43
 */
public class TestJDKProxy{
    
    @Test
    public void testSave(){
        /**
         * 1、创建一个目标对象
         * 2、创建一个事务
         * 3、创建一个拦截器
         * 4、动态产生一个代理对象
         */
        Object target = new PersonDaoImpl();
        Transaction transaction = new Transaction();
        MyInvocationHandler handler = new MyInvocationHandler(target, transaction);
        /**
         * 参数一：设置代码使用的类加载器，一般采用跟目标类相同的类加载器
         * 参数二：设置代理类实现的接口，跟目标类使用相同的接口
         * 参数三：设置回调对象，当代理对象的方法被调用时，会调用该参数指定对象的invoke方法
         */
        PersonDao personDao = (PersonDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
        
        personDao.updatePerson();
        personDao.savePerson();
    }
}
