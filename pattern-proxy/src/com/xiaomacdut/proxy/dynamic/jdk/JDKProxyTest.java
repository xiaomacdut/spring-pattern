package com.xiaomacdut.proxy.dynamic.jdk;

import com.xiaomacdut.proxy.staticed.Person;

/**
 * Created by Tom on 2018/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        
        try{
            Person person = (Person) new JDKMeipo().getInstance(new XieMu());
            person.findJob();
        }catch(Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
