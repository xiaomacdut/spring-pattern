package com.xiaomacdut.pattern_proxy.dynamic.jdk;

/**
 * 真实明星
 * @author xiaomacdut
 * @date 2019年4月7日 下午6:52:43
 */
public class RealStar implements StarInterface{
    
    @Override
    public void confer(){
        System.out.println("RealStar.confer()");
    }
    @Override
    public void signContract(){
        System.out.println("RealStar.signContract()");
    }
    @Override
    public void bookTicket(){
        System.out.println("RealStar.bookTicket()");
    }
    @Override
    public void sing(){
        System.out.println("张学友.sing()");// 真实角色的操作：真正的业务逻辑
    }
    @Override
    public void collectMoney(){
        System.out.println("RealStar.collectMoney()");
    }
    
}
