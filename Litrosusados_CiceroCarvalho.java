package litrosusados_cicerocarvalho;
//@author Cicero Carvalho
 
import java.util.Scanner;

public class Litrosusados_CiceroCarvalho {

    public static void main(String[] args) 
    {
       Scanner entrada;
       float tempg, velm, litru;
       
       entrada = new Scanner(System.in);
       
       System.out.print("Digite o tempo gasto na viagem: ");
       tempg = entrada.nextFloat();
       
       System.out.print("Digite a velocidade média: ");
       velm = entrada.nextFloat();
       
       litru = ((tempg * velm)/12);
       System.out.print("Os litros usados foram: "+ litru);
       
    }
    
}
