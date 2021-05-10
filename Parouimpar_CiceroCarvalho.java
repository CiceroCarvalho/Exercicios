package parouimpar_cicerocarvalho;
/*@author Cicero Carvalho*/

import java.util.Scanner;

public class Parouimpar_CiceroCarvalho {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um número: ");
        num = numero.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.print("O número " + num + " é par");
        }
        else
        {
            System.out.print("O número " + num + " é ímpar");
        }
            
    }
}
        
    

