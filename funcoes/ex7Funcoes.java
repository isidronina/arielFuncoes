import java.util.Scanner;
public class Main{
    public static int calcularFatorial(int numero){
        int resultado = 1;
        for (int i=1;i<=numero;i++){
            resultado= resultado*i;
        }
        return resultado;
    }
    public static void main(String[]args){
        Scanner e=new Scanner (System.in);
        System.out.print("Digite um numero inteiro: ");int numUsuario=e.nextInt();
        int fatorial= calcularFatorial(numUsuario);
        System.out.println("O fatorial de "+numUsuario+" é = "+fatorial);
        e.close();
    }
}