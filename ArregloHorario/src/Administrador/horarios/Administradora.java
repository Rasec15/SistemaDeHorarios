package Administrador.horarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administradora implements Metodos {

    @Override
    public void CrearProfesor() {

        InputStreamReader isr;
        isr = new InputStreamReader(System.in);
        BufferedReader br;
        br = new BufferedReader(isr);


        ArrayList coleccion1 = new ArrayList<>();
        ArrayList<profesor> coleccion2 = new ArrayList<>();


        String nombre = "";
        int horas = 0;
        int menu = 0;

        System.out.println("Digite El Nombre de Su Profesor(@) de su preferencia ?");

        try {

            nombre = br.readLine();

        } catch (IOException ex) {
        
        }




        coleccion1.add(nombre);

        System.out.println("");

        System.out.println("Su Docente es :" + nombre);

        System.out.println("");

        System.out.println("Digite las horas Que imparte Ese Profesor (20 o 40)");



        try {
            try {
                horas = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
            }

        } catch (NumberFormatException nfs) {

            System.out.println("ERROR USTED HA MARCADO UN CARACTER EN VEZ DE UN NUMERO FAVOR ELEGIR LOS NUMEROS PEDIDOS ");
        }


     
        System.out.println("");


        System.out.println("");

        System.out.println("Las horas trabajadas por Su docente son: "
                + ":" + horas);

        System.out.println("");

        coleccion1.add(horas);


        System.out.println("!Su Profesor ha sido Elegido al igual que la hora a Impartir!");

        System.out.println("");

        System.out.println("");



        System.out.println("Que Desea Hacer En Este Momento?");

    }

    @Override
    public void CrearMateria() {


        InputStreamReader isr;
        isr = new InputStreamReader(System.in);
        BufferedReader br;
        br = new BufferedReader(isr);


        ArrayList coleccion1 = new ArrayList<>();
        
        
        
        
        String etica = "Etica";
        String programacion2 = "Programacion 2";
        String programacion1 = "Programacion 1";
        String precalculo = "Precalculo";
        String database = "Base De Datos";
        String analisis = "Analisis";
        String bitmap = "Bitmap";
        String ccna = "CCNA";
        String psicologia = "Psicologia";
        String contabilidad = "Contabilidad";
        int creditos = 0;
        String aula = "1-1a";
        String aula2 = "2-2d";
        String aula3 = "CAD";
        String aula4 = "Auditorio 4";
        String aula5 = "4-2e";
        String dia1 = "Lunes";
        String dia2 = "Miercoles";
        String dia3 = "Jueves";
        String dia4 = "Martes y Jueves";
        String dia5 = "Martes ";
        int menu = 0;
        String eleccion = "";





        System.out.println("USTED HA ELEGIDO LA CREACION DE MATERIAS ELEGIGA LAS MATERIAS SIGTES POR EL MENU :");
        System.out.println("");

        System.out.println("1.Etica : Favor Marcar El #1");
        System.out.println("2.Precalculo : Favor Marcar El #2");
        System.out.println("3.Programacion 1 : Favor Marcar El #3");
        System.out.println("4.Programacion 2 : Favor Marcar El #4");
        System.out.println("5.DataBase o Base De Datos : Favor Marcar El #5 ");
        System.out.println("6.Analisis : Favor Marcar El #6");
        System.out.println("7.Bitmap : Favor Marcar El #7 ");
        System.out.println("8.CCNA : Favor Marcar El #8");
        System.out.println("9.Psicologia : Favor Marcar el #9");
        System.out.println("10.Contabilidad : Favor Marcar el #10");


        try {

            try {

                menu = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
            }

        } catch (NumberFormatException e) {

            System.out.println("ERROR! , USTED A ELEGIDO UN CARACTER DIFERENTE A LOS PEDIDOS P"
                    + "ORFAVOR INGRESE UN NUMERO DEL 1-4 ");

        }




        switch (menu) {


            case 1:


                System.out.println(" Su Materia Esta Siendo Creada..... " + etica);


                coleccion1.add(creditos);
                break;

            case 2:
                System.out.println(" Su Materia Esta Siendo Creada...... " + precalculo);


                coleccion1.add(creditos);
                break;



            case 3:
                System.out.println(" Su Materia Esta Siendo Creada... " + programacion1);


                coleccion1.add(creditos);
                break;


            case 4:
                System.out.println(" Estamos Creando Su Materia.... " + programacion2);

                coleccion1.add(creditos);
                break;


            case 5:
                System.out.println("Estamos Creando Su Materia...." + database);

                coleccion1.add(creditos);
                break;

            case 6:
                System.out.println("Su Materia Ha Sido Creada...." + analisis);
                break;

            case 7:
                System.out.println("Su Materia Esta Siendo Creada....." + bitmap);
                break;

            case 8:
                System.out.println("Su Materia Esta Siendo Creada....." + ccna);
                break;


            case 9:
                System.out.println("Su Materia Esta Siendo Creada....." + psicologia);
                break;

            case 10:
                System.out.println("Su Materia Esta Siendo Creada......" + contabilidad);
        }


        System.out.println("");
        System.out.println("");
        System.out.println("Que Desea Realizar En Estos Momentos ?");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        for (Iterator it = coleccion1.iterator(); it.hasNext();) {
            Object object = it.next();

        }


    }

    @Override
    public void DenifirHorario() {


        ArrayList<CreacionMateria> coleccion1 = new ArrayList<>();

        ArrayList<profesor> coleccion2 = new ArrayList<>();

        Object ObjProfesor = new Object();
        Object ObjMateria = new Object();


        InputStreamReader isr;
        isr = new InputStreamReader(System.in);
        BufferedReader br;
        br = new BufferedReader(isr);

        int eleccion = 0;
        String etica = "etica";
        String programacion2 = "Programacion 2";
        String programacion1 = "Programacion 1";
        String precalculo = "Precalculo";
        String ccna = "CCNA";
        String database = "Base De Datos";
        String calculo = "Calculo";
        String psicologia = "Psicologia";
        String contabilidad = "Contabilidad";
        String analisis = "Analisis";
        String bitmap = "Bitmap";
        int creditos = 0;
        String Dias = "";
        int menu = 0;
        String chequeo = "";
        String Nombre = "";
        String horas = "";
        String aula = "1-1a";
        String aula2 = "Cad";
        String aula3 = "Auditorio 2";
        String aula4 = "2-1b";
        String aula5 = "1-2f";
        String aula6 = "4-1d";
        String aula7 = "Auditorio 4";
        String aula8 = "Laboratorio 1";
        String aula9 = "4-2f";
        String aula10 = "1-1b";

        profesor objProfesor = new profesor(Nombre, menu, Dias);

        

        System.out.println("Su Horario Elegido Fue El Sigte ");
        System.out.println("");
        
   
            
            
            CreacionMateria ObjCreacionMateria = new CreacionMateria(etica, programacion2,
                    programacion1, precalculo, ccna, calculo, psicologia,
                    contabilidad, analisis, bitmap, creditos, aula, Dias);
            coleccion1.add(ObjCreacionMateria);
            
            
            
            System.out.println("Segun Su Eleccion Hecha Anteriormente Favor Marcar o Recordar"
                    + "los Numeros Que utilizo Para la Eleccion de Mateiras"
                    + "Esto Sera De Gran Ayuda Para Mostrarle Su Materia Elegida Conjunta Con Su Docente.....  ");
           
            
            
            System.out.println("");
            System.out.println("");
            System.out.println("Por Si No Recuerda Le Recarcamos El Menu De Seleccion "
                    + "De Materias Para Que Recuerde El Numero Que Eligio");
            
            
            System.out.println("");
            System.out.println("1.Etica : Favor Marcar El #1");
            System.out.println("2.Precalculo : Favor Marcar El #2");
            System.out.println("3.Programacion 1 : Favor Marcar El #3");
            System.out.println("4.Programacion 2 : Favor Marcar El #4");
            System.out.println("5.DataBase o Base De Datos : Favor Marcar El #5 ");
            System.out.println("6.Analisis : Favor Marcar El #6");
            System.out.println("7.Bitmap : Favor Marcar El #7 ");
            System.out.println("8.CCNA : Favor Marcar El #8");
            System.out.println("9.Psicologia : Favor Marcar el #9");
            System.out.println("10.Contabilidad : Favor Marcar el #10");
            System.out.println("");
            System.out.println("Escriba El Numero De Su Materia.....");
            
            try {
            
                eleccion = Integer.parseInt(br.readLine());
            } 
            catch (IOException ex) {
            }
            
            System.out.println("");
            System.out.println("");
            
            
            
            switch (eleccion) {


                case 1:
                    ObjCreacionMateria.getEtica();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getEtica());
                        System.out.println(" : Es La Materia Que Impartira Su Docente ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 3);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula3);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                case 2:

                    ObjCreacionMateria.getPrecalculo();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getPrecalculo());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 5);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula8);
                        
                        
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");



                case 3:
                    ObjCreacionMateria.getProgramacion1();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getProgramacion1());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula3);

                        break;

                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");



                case 4:
                    ObjCreacionMateria.getProgramacion2();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getProgramacion2());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula5);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                case 5:
                    ObjCreacionMateria.getDatabase();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getDatabase());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                case 6:
                    ObjCreacionMateria.getAnalisis();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getAnalisis());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 3);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula2);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                case 7:
                    ObjCreacionMateria.getBitmap();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getBitmap());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula10);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                case 8:
                    ObjCreacionMateria.getCcna();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getCcna());

                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula9);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                case 9:
                    ObjCreacionMateria.getPsicologia();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getPsicologia());
                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula6);
                        break;
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                case 10:
                    ObjCreacionMateria.getContabilidad();
                    for (CreacionMateria creacionMateria : coleccion1) {
                        System.out.println(creacionMateria.getContabilidad());

                        System.out.println("La Materia Elegida Por Usted ");
                        System.out.println("y Los creditos Que posee la Misma Son  " + 4);
                        System.out.println("Dicha Materia Es Dada en el Aula " + aula7);
                        break;
                    }





                    System.out.println("");
                    System.out.println("");


                    for (Iterator it = coleccion1.iterator(); it.hasNext();) {
                        Object ObjC = it.next();
                    
                    }

            }
        }
    



@Override
    public void GenerarPFD() {
    



}
    
    
    
}
