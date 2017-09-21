package com.cl.learn.rmis;

import java.rmi.RemoteException;

/**
 * 实现接口，当客户端调用时，实际会调用这里的接口方法
 * Created by L on 17/9/21.
 */
public class MyRemote1Impl implements MyRemote1 {

    public MyRemote1Impl() throws RemoteException{
        super();
    }

    public String meathod1(String str) throws RemoteException {
        return str.toUpperCase();
    }

    public Account getAdminAccount(Account account) throws RemoteException {
        account.setUsername("userName");
        return account;
    }

}
