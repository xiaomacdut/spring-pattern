package com.xiaomacdut.pattern_proxy.dynamic.jdk;

import com.xiaomacdut.pattern_proxy.staticed.Person;

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
