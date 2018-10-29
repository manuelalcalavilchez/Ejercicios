/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Ejercicio 1. Escribe un programa que lea por teclado las notas de los diferentes instrumentos de calificación que utilizamos en la modalidad semipresencial para una evaluación y a continuación calcule y muestre por pantalla la nota final de dicha evaluación atendiendo a los siguientes criterios:
La participación pondera un 10% de la nota final.
Los cuestionarios online pondera un 5 % de la nota final.
La tarea online pondera un 25% de la nota final.
La tarea presencial pondera un 25% de la nota final.
El examen presencial pondera un 35% de la nota final.
En el caso de que la tarea online, la tarea presencial o el examen presencial no supere el 5, la nota final será un 4.
Debes validar que las entradas para cada instrumento están comprendidas entre 0 y 10 (ambos inclusive). */
package ejercicio1;

import utilidades.Entrada;

/**
 *
 * @author Manuel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //definir variables
        double participacion,tareaOnline,tareaPresencial,examenOnline,examenPresencial,notaMedia;
        
        //capturamos valores del usuario
        do{
        System.out.println("Introduzca la nota por participación(0-10):");
        participacion=Entrada.entero();
        } while (participacion<0 || participacion>10);
        
        do{
        System.out.println("Introduzca la nota de la tarea online(0-10):");
        tareaOnline=Entrada.entero();
        } while (tareaOnline<0 || tareaOnline>10);
        
        do{
        System.out.println("Introduzca la nota de la tarea presencial(0-10):");
        tareaPresencial=Entrada.entero();
        } while (tareaPresencial<0 || tareaPresencial>10);
    
        do{
        System.out.println("Introduzca la nota de el examen online(0-10):");
        examenOnline=Entrada.entero();
        } while (examenOnline<0 || examenOnline>10);
        do{
        System.out.println("Introduzca la nota de el examen presencial(0-10):");
        examenPresencial=Entrada.entero();
        } while (examenPresencial<0 || examenPresencial>10);

     //proceso
        //notaMedia=(participacion*10/100)+(examenOnline*5/100)+(examenPresencial*35/100)+ (tareaOnline*25/100)+(tareaPresencial*25/100);
        notaMedia=(participacion*0.10)+(examenOnline*0.05)+(examenPresencial*0.35)+ (tareaOnline*0.25)+(tareaPresencial*0.25);
        
        if (tareaPresencial<5 | tareaOnline<5 | examenPresencial<5)
            {
             System.out.println("Su nota media es 4");
            }
        else
            System.out.println("Su nota media es "+ notaMedia);
    }
           
            
}