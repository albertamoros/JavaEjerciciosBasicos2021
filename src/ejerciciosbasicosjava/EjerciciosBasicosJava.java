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

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana){
            return true;
        }
        //si llega aqui es que no es fin de semana 
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    
/**
 * multa:
 */
    public int multa (int velocidad, boolean birthday){
        if (birthday){
            velocidad = velocidad - 5; //velocidad -=5;
        }
        //si va a menos de 60 por hora
        if (velocidad<= 60){
            return 0;
        }
        //si va entre 61 y 80
        if (velocidad > 60 && velocidad <= 80){
            return 1;
        }
        //en cualquie otro valor devolvemos multa grande
        return 2;
    }
    /**
     * @param numero el numero a evaluar si es o no validoso. es validoso si es multiplo de 11 o uno mas
     * de un multiplo de 11
    */
    public boolean muyVanidoso (int numero){
        if (numero % 11 < 2 ){ //si la division da 0 devuelve 0
            return true;
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        System.out.println("Ejercico01 Ardillas");
        System.out.println(ejercicio.fiestaArdillas(30, false) );
        System.out.println(ejercicio.fiestaArdillas(50, false) );
        System.out.println(ejercicio.fiestaArdillas(70, true) );
        
        System.out.println("ejercicio02 multa");
        System.out.println(ejercicio.multa(60, false) );
        System.out.println(ejercicio.multa(65, false) );
        System.out.println(ejercicio.multa(65, true) );
        
        System.out.println("ejercicio03 vanidoso");
        System.out.println(ejercicio.muyVanidoso(22) );
        System.out.println(ejercicio.muyVanidoso(23) );
        System.out.println(ejercicio.muyVanidoso(24) );
        
    }
    
}
