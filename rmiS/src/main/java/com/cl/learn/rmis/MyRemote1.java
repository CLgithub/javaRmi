package com.cl.learn.rmis;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 定义一个接口，继承Remote接口，标记该接口可以远程访问
 * Created by L on 17/9/21.
 */
public interface MyRemote1 extends Remote{

    public String meathod1(String str) throws RemoteException;

    public Account getAdminAccount(Account account) throws RemoteException;

}
