package com.cl.learn.rmic;

import com.cl.learn.rmis.Account;
import com.cl.learn.rmis.MyRemote1;

import java.net.SocketTimeoutException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by L on 17/9/21.
 */
public class Client {
    public static void main(String []args){

        try {
            Registry registry = LocateRegistry.getRegistry("localhost",2001);
            MyRemote1 myRemote1= (MyRemote1) registry.lookup("myRemote1");
            Account adminAccount = myRemote1.getAdminAccount(new Account());
            System.out.println(adminAccount);
            System.out.println(myRemote1.meathod1("x"));
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
