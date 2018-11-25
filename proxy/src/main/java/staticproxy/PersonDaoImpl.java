package staticproxy;

/**
 * 被代理
 * @author maj
 * @date 2018年9月9日 下午10:46:16
 */
public class PersonDaoImpl implements PersonDao{
    
    @Override
    public void savePerson(){
        System.out.println("save person。。。。。。。。");
        
    }
    
}
