/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Alberto
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana) {
        //si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana) {
            return true;
        }
        //si llega aqui es que no es fin de semana 
        if (numBellotas >= 40 && numBellotas <= 60) {
            return true;
        }
        return false;
    }

    /**
     * multa:
     */
    public int multa(int velocidad, boolean birthday) {
        if (birthday) {
            velocidad = velocidad - 5; //velocidad -=5;
        }
        //si va a menos de 60 por hora
        if (velocidad <= 60) {
            return 0;
        }
        //si va entre 61 y 80
        if (velocidad > 60 && velocidad <= 80) {
            return 1;
        }
        //en cualquie otro valor devolvemos multa grande
        return 2;
    }

    /**
     * @param numero el numero a evaluar si es o no validoso. es validoso si es
     * multiplo de 11 o uno mas de un multiplo de 11
     */
    public boolean muyVanidoso(int numero) {
        if (numero % 11 < 2) { //si la division da 0 devuelve 0
            return true;
        }
        return false;
    }

    public boolean contesta(boolean matinal, boolean madre, boolean dormido) {
        if (dormido == true) {
            return false;
        }

        if (matinal == true && madre == false) {
            
            return false;
            
        } 
        return true;
    }  
    
    public boolean menorPor10(int a, int b, int c) {
        if(a - b == 10){
            return true;
        }
        if(a - c == 10){
            return true;
        }
        if(b - a == 10){
            return true;
        }
        if(b - c == 10){
            return true;
        }
        if(c - a == 10){
            return true;
        }
        if(c - b == 10){
            return true;
        }
        return false;
    }
    
    public boolean digitoIgual (int numero1, int numero2){
        if(numero1/10 == numero2/10 || numero1%10 == numero2%10){
            return true;
        }
        if(numero1/10 == numero2%10 || numero1%10 == numero2/10){
            return true;
        }
        return false;
    }
    
    public boolean multiploMultiple (int numero1){
        
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();

        System.out.println("Ejercico01 Ardillas");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));

        System.out.println("");
        System.out.println("ejercicio02 multa");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));

        System.out.println("");
        System.out.println("ejercicio03 vanidoso");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));

        System.out.println("");
        System.out.println("ejercicio04 contesta");
        System.out.println(ejercicio.contesta(false, false, false));
        System.out.println(ejercicio.contesta(false, false, true));
        System.out.println(ejercicio.contesta(true, false, false));
        
        System.out.println("");
        System.out.println("ejercicio05 menorPor10");
        System.out.println(ejercicio.menorPor10(1, 7, 11));
        System.out.println(ejercicio.menorPor10(1, 7, 10));
        System.out.println(ejercicio.menorPor10(11, 1, 7));
        
        System.out.println("");
        System.out.println("ejercicio06 digitoIgual ");
        System.out.println(ejercicio.digitoIgual(12, 23));
        System.out.println(ejercicio.digitoIgual(12, 43));
        System.out.println(ejercicio.digitoIgual(12, 44));
    }

}
