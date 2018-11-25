package com.xiaomacdut.pattern_proxy.staticed;

/**
 * 代理类
 * @author xiaomacdut
 * @date 2018年11月25日 下午6:31:57
 */
public class Father {

    private Person person;

    //没办法扩展
    public Father(Person person){
        this.person = person;
    }
    // 拿到目标对象的引用
    public void findLove(){
        System.out.println("根据你的要求物色");
        this.person.findLove();
        System.out.println("双方父母是不是同意");
    }
}
