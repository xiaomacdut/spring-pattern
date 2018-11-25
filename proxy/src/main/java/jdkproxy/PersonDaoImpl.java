package jdkproxy;

/**
 * 实现类
 * @author maj
 * @date 2018年8月25日 上午9:36:51
 */
public class PersonDaoImpl implements PersonDao{
    
    @Override
    public void savePerson(){
        System.out.println("save person");
    }
    
    @Override
    public void updatePerson(){
        System.out.println("update person");
        
    }
    
}
