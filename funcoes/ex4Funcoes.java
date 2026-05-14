/*Ariel Isidro Nina Saavedra*/
import java.util.Scanner;
public class ex4Funcoes{
    public static boolean isPar(int numero){
        if(numero %2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        while(true){
            System.out.println("\nDigite -1 para encerrar\n");
            System.out.print("digite um numero: ");int numEscolhido=e.nextInt();
            
            if (numEscolhido==-1){
                System.out.println("encerrando...");
                break;
            }
            if (isPar(numEscolhido)){
                System.out.println("Esse número é Par");
            }else{
                System.out.println("Esse número é Impar");
            }
        }
        e.close();
    }
}

