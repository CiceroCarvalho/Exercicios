2package potencia_cicerocarvalho;
//@author Cicero Carvalho

import java.util.Scanner;

public class Potencia_CiceroCarvalho {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = valor.nextInt();

        int result, i = 0;
  
        while (i<=15)
        {
            result = (int) Math.pow(num, i);
            System.out.println(num + " ^ " + i + " = " + result);
            i++; 
        }
    }
    
}

            
            
        