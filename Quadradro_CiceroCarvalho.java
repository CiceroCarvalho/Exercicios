package quadradro_cicerocarvalho;
// * @author Cicero Carvalho

import java.util.Scanner;

public class Quadradro_CiceroCarvalho {

    public static void main(String[] args) 
    {
       Scanner entrada;
       double num1, num2, sub, quadr;
       
       entrada = new Scanner(System.in);
       
       System.out.print("Digite o 1º número: ");
       num1 = entrada.nextDouble();
       
       System.out.print("Digite o 2º número: ");
       num2 = entrada.nextDouble();
       
       sub = num1 - num2;
       quadr = Math.pow(sub,2);
       
       System.out.print("O quadradro da diferença do 1º número com o 2º é: " + quadr);   
    }
    
}
