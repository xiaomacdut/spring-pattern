package staticproxy;

import org.junit.Test;

/**
 * @author maj
 * @date 2018年9月9日 下午10:51:07
 */
public class TestPersonProxy{
    
    @Test
    public void testSave(){
        // 被代理类
        PersonDao personDao = new PersonDaoImpl();
        // 代理对象
        PersonDaoProxy proxy = new PersonDaoProxy(personDao);
        proxy.savePerson();
    }
}
