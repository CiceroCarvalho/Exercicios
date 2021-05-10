package valorespares_cicerocarvalho;
//@author Cicero Carvalho

public class Valorespares_CiceroCarvalho {

    public static void main(String[] args) {        
        int val,i;
         
        for (i=1000; i<=1500; i++)
        {
            val = i % 2;
            if(val == 0)
            {
               System.out.println("Números pares: " + i);
            }
        }
        
    }
    
}
