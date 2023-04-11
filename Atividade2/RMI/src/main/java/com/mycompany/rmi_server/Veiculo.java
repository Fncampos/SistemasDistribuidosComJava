/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi_server;


public class Veiculo{
    
    private String nome;
    private String marca;
    private int ano;
    private double Valor;

    public Veiculo(String nome, String marca, int ano, double Valor) {
        //super();
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.Valor = Valor;
    }
       
    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAno() {
        return this.ano;
    }

    public double getValor() {
        
        return this.Valor;
    }
   
}

     
     
   