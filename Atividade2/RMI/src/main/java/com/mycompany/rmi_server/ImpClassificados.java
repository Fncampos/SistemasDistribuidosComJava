/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_server;

import java.rmi.RemoteException;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import com.mycompany.rmi_interface.InterfaceClassificadoVeiculos;


public class ImpClassificados extends UnicastRemoteObject implements InterfaceClassificadoVeiculos {
    private static final long serialVersionUID = 1L;
    
    ArrayList <Veiculo> carros = new ArrayList();

    public ImpClassificados() throws RemoteException {
        super();
    }
   
    @Override
    public void add(String nome, String marca, int ano, double valor){
        Veiculo objveiculo = new Veiculo(nome, marca, ano,valor);
        carros.add(objveiculo);
        
    }
        
    @Override
    public String exibeLista(){
        int total = 0;
        
        StringBuilder carroList = new StringBuilder("lista de carros:");
         for(Veiculo carro:carros){
           total++;
           String info = "Cliente: "+carro.getNome()+ "\nMarca: "+carro.getMarca()+"\nAno: "+Integer.toString(carro.getAno())+"\nValor: R$"+Double.toString(carro.getValor())+"\n----------------------------";
           carroList.append("\n").append(info);
           
         }
         carroList.append("\nTotal: "+Integer.toString(total));
         return carroList.toString();
    }
     public String search2Ano(int ano){
        int total = 0;
        
        StringBuilder carroList = new StringBuilder("lista de carros:");
        for(Veiculo carro:carros){
           if(carro.getAno()== ano){ 
            total++;
            String info = "Cliente: "+carro.getNome()+ "\nMarca: "+carro.getMarca()+"\nAno: "+Integer.toString(carro.getAno())+"\nValor: R$"+Double.toString(carro.getValor())+"\n----------------------------";
            carroList.append("\n").append(info);
           }
         }
         carroList.append("\nTotal: "+Integer.toString(total));
         return carroList.toString();
    }
}    
    