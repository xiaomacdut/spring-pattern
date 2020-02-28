package com.xiaomacdut.pattern_proxy.baseInterfaceproxy;

/**
 * 对生产厂家要求的接口
 * @author xiaomacdut
 * @date 2020年2月18日 下午6:43:31
 */
public interface IProducer{
    
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);
    
    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
