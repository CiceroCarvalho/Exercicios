package equacao_cicerocarvalho;
/*@author Cicero Carvalho*/

import java.util.Scanner;

public class Equacao_CiceroCarvalho {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        double vala, valb, valc, delta, x1, x2;
        
        System.out.print("Digite o valor a: ");
        vala = valor.nextDouble();
        
        System.out.print("Digite o valor b: ");
        valb = valor.nextDouble();
        
        System.out.print("Digite o valor c: ");
        valc = valor.nextDouble();
        
        if(vala != 0)
        {
            delta= (Math.pow(valb,2)) - (4*vala*valc);
            
            if (delta > 0)
            {
                x1=((-valb)+Math.sqrt(delta))/(2*vala);
                x2=((-valb)-Math.sqrt(delta))/(2*vala);
                
                System.out.println("As raízes são x1= "+ x1 +" e x2= " + x2 + ".");
            }
            else
            {
                if (delta == 0)
                {
                    x1=((-valb)+Math.sqrt(delta))/(2*vala);
                    
                    System.out.print("As raizes são: " + x1 + ".");
                }
                else
                {
                    if (delta < 0)
                    {
                        System.out.print("A Equação não possui resultados reais.");
                    }
                }
            }
        }
        else
        {
            System.out.print("Não foi possível calcular a equação.");
        }
    }
    
}
