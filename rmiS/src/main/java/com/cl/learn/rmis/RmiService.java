package com.cl.learn.rmis;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by L on 17/9/21.
 */
public class RmiService {
    public static void main(String[] arg) throws RemoteException {
        MyRemote1Impl myRemote1Impl= new MyRemote1Impl();
        MyRemote1 myRemote1= (MyRemote1) UnicastRemoteObject.exportObject(myRemote1Impl,0);

//        MyRemote1 myRemote1=new MyRemote1Impl();
        Registry registry = LocateRegistry.createRegistry(2001);

        registry.rebind("myRemote1",myRemote1);
    }
}
