/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pct;

/**
 *
 * @author Etec
 */
public class Data {
     //Declaração de Atributos
   
    private int dia;
    private int mes;
     private int ano;
    
    //Métodos
    public String exibirData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String exibirMes(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String exibirAno(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public void setDia(int dia){
        if((dia >= 1) && (dia <= 31)){
        this.dia = dia;
    }else{
            this.dia = 1;
        }
}
    
    
        public void setMes(int mes){
        if((mes >= 1) && (mes <= 12)){
        this.mes = mes;
    }else{
            this.mes = 1;
        }
}
        
        
            public void setAno(int ano){
        if((ano >= 2022) && (ano <= 2030)){
        this.ano = ano;
    }else{
            this.ano = 2022;
        }
}
            
            public int getMes(){
        
        return this.mes;}
            
            public int getAno(){
        
        return this.ano;}
    
    public int getDia(){
        
        return this.dia;
    }
}