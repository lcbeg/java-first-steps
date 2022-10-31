package org.generation.fiesta.test;

class Automovil{
    { 
        System.out.println("mensaje D");
    }
    public Automovil(){
        System.out.println("mensaje E");
    }
    
}

class Sedan extends Automovil{
    
    static {
        System.out.println("mensaje A");
    }
    
    public Sedan() {
        System.out.println("mensaje G");
    }
    
    {
        System.out.println("mensaje F");
    }
    
    static {
        System.out.println("mensaje B");
    }
    
}

public class Vocho extends Sedan {            
    
    public static void main(String[] args) {
        System.out.println("mensaje C");
        new Vocho();
        System.out.println("mensaje H");
        /**
         * Imprimir en consola, en los lugares de System.out.println
         * la adecuada secuencia: 
         *   A
         *   B
         *   C
         *   D
         *   E
         *   F
         *   G
         *   H
         */
    }

}