package org.example.fibonacci;

public class Fibonacci {

    public static int fibonacci(int value)
    {
        int n = 0;
        if (value>1){
            n = fibonacci(value-1) + fibonacci(value-2);  //función recursiva
        }
        else if (value==1) {  // caso base
            n = 1;
        }
        else if (value==0){  // caso base
            n = 0;
        }
        else{ //error
           throw new RuntimeException("Debes ingresar un tamaño mayor o igual a 1");
        }
        return n;
    }
}
