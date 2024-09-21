import java.util.Scanner;
public class Beecrowd1004 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int A,B,PROD;
       
        //ler variáveis
        A = leitor.nextInt();
        B = leitor.nextInt();
        
        PROD = A*B;
        
        //mostrar resultado no console
        System.out.printf("PROD = %d%n", PROD);
    }
}