/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pct;

/**
 *
 * @author Etec
 */
public class TesteData {
     public static void main(String[] args) {
        
        
        //criação e instancia do objeto da classe data
        Data data = new Data();
        
        
        //Construção do objeto
   //     data.dia = 41;
        data.setDia(41);
        data.setMes  (12);
        data.setAno  (2022);
        
        //imprimindo a data
        System.out.println("Data: " + data.exibirData());
         System.out.println("Mes: " + data.exibirData());
          System.out.println("Ano: " + data.exibirData());
        
        //testando o get
         System.out.println("Dia: " + data.getDia());
         
         System.out.println("Mes: " + data.getMes());
         
         System.out.println("Ano: " + data.getAno());
    }
}
