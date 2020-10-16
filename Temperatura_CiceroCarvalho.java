 package temperatura_cicerocarvalho;
 //@author Cicero Carvalho

 import java.util.Scanner;
 
 public class Temperatura_CiceroCarvalho {

    public static void main(String[] args) 
    {
        Scanner entrada;
        float tempc, tempf;
        
        entrada = new Scanner (System.in);
        
        System.out.print("Digite a temperatura em Cº: ");
        tempc = entrada.nextFloat();
        
        tempf = (float) ((tempc*1.8)+32);
        System.out.print("A temperatura em Fahreint é: "+ tempf);
    }
    
}
