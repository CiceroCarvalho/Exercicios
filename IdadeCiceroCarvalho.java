package idade.cicerocarvalho;
// @author Cicero Carvalho

import java.util.Scanner;


public class IdadeCiceroCarvalho {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        short anon, anoc, idade;
        
        System.out.print("Digite seu ano de nascimento: ");
        anon = entrada.nextShort();
        
        System.out.print("Digite o ano corrente: ");
        anoc = entrada.nextShort();
        
        idade = (short) (anoc - anon);
        
        System.out.print("Sua idade é: " + idade);
    }
    
}
