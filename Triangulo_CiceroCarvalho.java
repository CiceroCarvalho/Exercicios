package triangulo_cicerocarvalho;
/*@author Cicero Carvalho*/

import java.util.Scanner;

public class Triangulo_CiceroCarvalho {

    public static void main(String[] args) {
       Scanner valor = new Scanner(System.in);
       
       double ladoa, ladob, ladoc;
       
       System.out.print("Digite o valor A: ");
       ladoa = valor.nextDouble();
       
       System.out.print("Digite o valor B: ");
       ladob = valor.nextDouble();
       
       System.out.print("Digite o valor C: ");
       ladoc = valor.nextDouble();
       
       if ((ladoa+ladob>ladoc) && (ladoa+ladoc>ladob) && (ladob+ladoc>ladoa))
       {
           System.out.println("Os valores específicados formam um triângulo.");
           
           if ((ladoa == ladob) && (ladoa == ladoc) && (ladob == ladoc))
           {
               System.out.println("O triângulo é Equilátero.");
           }
           else
           {
               if ((ladoa != ladob) && (ladoa != ladoc) && (ladob != ladoc))
               {
                   System.out.print("O triângulo é Escaleno.");
               }
               else
               {
                   if (((ladoa == ladob) && (ladoa != ladoc)) || ((ladoa == ladoc) && (ladoa != ladob)))
                   {
                       System.out.println("O triângulo é Isósceles.");
                   }
               }
           }
       }
       else
       {
           System.out.print("Os valores específicados não formam um triângulo.");
       }
               
    }
    
}
