/*Ariel Isidro Nina Saavedra*/
import java.util.Scanner;
public class ex5Funcoes{
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        int numEscolhido;
        int dia;
        
        System.out.print("digite um numero: ");numEscolhido=e.nextInt();
        System.out.println("O dia da semana escolhido foi:"+exibirDiaSemana(numEscolhido));
        e.close();
    }
    
    public static String exibirDiaSemana(int numEscolhido){
        switch (numEscolhido){
            case 1: 
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sabado";
            default:
                return "Dia da semana inválido";
        }
            
    }
}

