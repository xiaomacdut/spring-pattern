package staticproxy;

/**
 * 代理类
 * @author maj
 * @date 2018年9月9日 下午10:46:57
 */
public class PersonDaoProxy implements PersonDao{
    
    private PersonDao personDao;
    
    public PersonDaoProxy(PersonDao personDao){
        this.personDao = personDao;
    }
    
    @Override
    public void savePerson(){
        this.personDao.savePerson();
    }
    
}
