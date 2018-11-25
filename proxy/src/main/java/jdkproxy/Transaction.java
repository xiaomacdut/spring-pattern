package jdkproxy;

/**
 * 事务
 * @author maj
 * @date 2018年8月25日 上午9:26:01
 */
public class Transaction{
    
    void beginTransaction(){
        System.out.println("begin Transaction");
    }
    
    void commit(){
        System.out.println("commit");
    }
}
