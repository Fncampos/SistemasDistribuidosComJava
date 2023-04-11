/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_cliente;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import com.mycompany.rmi_interface.InterfaceClassificadoVeiculos;


public class Cliente {
        
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException{
        String url= "rmi://localhost/RMIclassificados";
        InterfaceClassificadoVeiculos serv = (InterfaceClassificadoVeiculos)Naming.lookup(url);
        Scanner scan2 = new Scanner(System.in);
        int opcao; 
        boolean condicao = true;
        System.out.println("***********************************************************");
        System.out.println("         Bem Vindo ao Classificados de Veículos            ");
        System.out.println("***********************************************************");
        while(condicao){
            System.out.println("\n----------------------Menu--------------------------\n");
            System.out.println("1- Cadastrar\n"
                    +"2- Pesquisar\n"
                    +"3- Exibir a Lista completa\n"
                    +"4- Finalizar ");
                    opcao = scan2.nextInt();
            System.out.println("\n---------------------------------------------------\n");        
            switch(opcao){
                case 1: 
                    Scanner scan1 = new Scanner(System.in);
                    System.out.println("\n------------------------------------------------");
                    System.out.println("Digite o Nome do cliente: ");
                    String nome = scan1.nextLine();
                    System.out.println("Digite a marca do Veiculo: ");
                    String marca = scan1.nextLine();
                    System.out.println("Digite o ano do Veiculo: ");
                    int ano = scan1.nextInt();
                    System.out.println("Digite o Valor do Veiculo: ");
                    double valor = scan1.nextDouble();
                    serv.add(nome, marca, ano, valor);
                    System.out.println("\nDados salvos com Sucesso!");
                    break;
                case 2:
                    System.out.println("\n------------------------------------------------\n");
                    System.out.println("Digite o ano do Veiculo para pesquisar: ");
                    int anopes = scan2.nextInt();
                    System.out.println(serv.search2Ano(anopes));
                    break;
                case 3:
                    System.out.println(serv.exibeLista());
                    break;
                case 4:
                    System.out.println("\n------------------------------------------------\n");
                    System.out.println("Programa finalizado\n\n");
                    System.out.println("\n------------------------------------------------\n");
                    condicao = false;
                    break;
            }
          
            
        }
  
}
}
