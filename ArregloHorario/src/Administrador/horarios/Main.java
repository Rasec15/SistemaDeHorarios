
package Administrador.horarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main  {
    
    public static void main (String[]args ) throws IOException{
     
        ArrayList coleccion1=new ArrayList<>();        
        
      
        
          InputStreamReader isr;
            isr = new InputStreamReader(System.in);
            BufferedReader br;
            br= new BufferedReader(isr);
   
Administradora met= new Administradora();
                      
             
        int menu=0;
        boolean comenzar=true;
        
        
        
        while(comenzar==true){
    System.out.println("*         BIENVENIDO          *");
            
            System.out.println("*    SISTEMA ADMINISTRADOR DE HORARIOS   *");
            System.out.println("");
            System.out.println("Ingrese El numero del Menu Deseado:....");System.out.println("");
              
            System.out.println("1.Seleccion de profesor"); 
            
            System.out.println("2.Seleccin de Mateiras");
            
            System.out.println("3.Seleccion los Horarios");         
            
            System.out.println("4.Generar PDF ");
            System.out.println("");
            
            
            System.out.println("");
    
     try{
            menu= Integer.parseInt(br.readLine());
                    
             }
           catch (IOException | NumberFormatException e){
           System.out.println("ERROR! , USTED A ELEGIDO UN CARACTER DIFERENTE A LOS PEDIDOS P"
                   + "ORFAVOR INGRESE UN NUMERO DEL 1-4 ");
            
           }
           
          
        
      
          if (menu==1){ 
              
          met.CrearProfesor();
          }
          if(menu==2){
              
          met.CrearMateria();
          }
          
          if(menu==3){
          met.DenifirHorario();
          
          }
          
          if(menu==4){
          met.GenerarPFD();
          }
          
                  
          
          
          
          }
    }




    }
