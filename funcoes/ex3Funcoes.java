import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        Scanner e = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite dois numeros:");
        System.out.print("1° numero:"); n1=e.nextInt();
        System.out.print("2° numero:"); n2=e.nextInt();

        System.out.println("o maior numero digitado é: " +encontarMax(n1,n2));
    
        e.close();
    
    }
    public static int encontarMax(int n1,int n2){
        if (n1>n2){
            return n1;
        }else{
            return n2;
        }
    }
}