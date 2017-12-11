/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso
 */
public class programa_evaluacion {
    
    public static void llenararreglo() {
    
    //Llenar un arreglo de 10 elementos con numeros pandemicos.
    int array[]=new int[10];//se crea un arreglo entero
    for (int i=0; i<array.length; i++){//se crea un bucle for con variable inicial
        array[i]=(int)(Math.random()*10);//se da valores random al arreglo por medio de math.random
       JOptionPane.showMessageDialog(null, array[i]);    //se imprime por ventana dicho arreglo
    }
    
}
    
     public static void Imprimir(){
         //Imprimir el arreglo arrayTemperaturas almacenandolos previamente en el String
            
        String[] arrayTemperaturas={"Hola","Soy","Un","Arreglo","De","Temperaturas"};//se crea un arreglo tipo string
        String acu="";//se otorga un acumulador
        for (int i=0; i>arrayTemperaturas.length; i++){//se crea un bucle for usando .length
             acu+=arrayTemperaturas[i]+" ";//se le otorga los valores del arreglo al acumulador
             
         }
         JOptionPane.showMessageDialog(null, acu);//se imprime por ventana el acumulador
             
     }
     
     public static void ordenar(){
         //ordenar el arreglo en orden ascendente utilizando una clase del JDK de java
         int array[]=new int[10];//se crea un arreglo
    for (int i=0; i<array.length; i++){//se cre un bucle for usando .length
        array[i]=(int)(Math.random()*10);
        Arrays.sort(array);//se utiliza la opcion .sort del JDK de java para ordenar el arreglo
       JOptionPane.showMessageDialog(null, array[i]);    
     }
     }
     
     public static void maximo(){
         //retornar el maximo de un arreglo previamente convertido en un arraylist
              int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
         List<Integer>arr=new ArrayList();//se transforma un arreglo en lista
        
         arr=Arrays.asList(array[i]);//se le asigna a una variable el arreglo
         Integer max=Collections.max(arr);//se utiliza la opcion collection maximo para encontrar el valor maximo del arreglo
         JOptionPane.showMessageDialog(null, max);}
         
     }
     
     public static void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("INGRESE EL NUMERO DE LA OPCION A REALIZAR\n\n"
               + "MENU OPCIONES\n\n"
               + "1) Llenar el arreglo\n"
               + "2) Imprimir arreglo String\n"
               + "3) Ordenar arreglo\n"
               + "4) Hallar el maximo de un arreglo\n"
               + "5) SALIR--->\n\n"));
       
        
       switch(op){
           
           case 1:
               llenararreglo();
               break;
           case 2:
               Imprimir();
               break;
           case 3:
               ordenar();
               break;
           case 4:
               maximo();
               break;
                
       }
    } while (op!=5);
}
}
