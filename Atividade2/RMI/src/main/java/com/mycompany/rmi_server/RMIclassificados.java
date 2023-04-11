/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIclassificados {
    public static void main (String [] args) throws RemoteException, MalformedURLException{
        LocateRegistry.createRegistry(1099);
        ImpClassificados serv = new ImpClassificados();
        Naming.rebind("RMIclassificados", serv);
        System.out.println("Servidor Rodando!!!!");
    }
}
