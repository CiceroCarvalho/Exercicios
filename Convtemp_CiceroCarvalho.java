package convtemp_cicerocarvalho;
//@author Cicero Carvalho

import java.util.Scanner;

public class Convtemp_CiceroCarvalho {

    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        
        int tempc, tempf, i = 0;
        
        System.out.print("Digite a temperatura em Celsius: ");
        tempc = temperatura.nextInt();
        
        do
        {
          tempf = (int) (((tempc + i) *1.8)+32);
          System.out.println("Temperatura em fahrenheit: " + tempf);
          i+= 10;
        }
        while(i<=100);
    }
    
}
