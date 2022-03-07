package org.example.fibonacci;

public class Fibonacci {

    public static int fibonacci(int value)
    {
        if (value>1){
            return fibonacci(value-1) + fibonacci(value-2);  //función recursiva
        }
        else if (value==1) {  // caso base
            return 1;
        }
        else if (value==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
}
