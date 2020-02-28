package com.xiaomacdut.pattern_proxy.baseInterfaceproxy;

/**
 * @author xiaomacdut
 * @date 2020年2月18日 下午6:44:16
 */
public class Producer implements IProducer{
    
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("销售产品，并拿到钱：" + money);
    }
    
    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱：" + money);
    }
}
