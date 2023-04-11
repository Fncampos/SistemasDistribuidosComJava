/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rmi_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceClassificadoVeiculos extends Remote {
    public void add(String nome, String marca, int ano, double Valor)throws RemoteException;;
    public String exibeLista()throws RemoteException;
    public String search2Ano(int ano)throws RemoteException;
}

