package com.bjpowernode.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//必须实现InvocationHandler接口，完成代理类要做的功能（1.调用目标方法，2.实现功能增强）
public class MySellHandler implements InvocationHandler {

    private Object target = null;

    //动态代理:目标对象是活动的，需要传进来。
    //传入是谁，就给谁创建代理。
    public MySellHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        //向厂家发送订单，我购买了U盘，让厂家发货
        //float price = factory.sell(amount);//厂家的价格
        res =  method.invoke(target,args);//执行目标方法

        //增强功能
        if (res != null){
            Float price = (Float)res;
            price = price + 25 ;
            res = price;
        }

        //增加后的价格
        return res;
    }
}
