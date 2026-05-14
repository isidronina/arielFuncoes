/*Ariel Isidro Nina Saavedra*/
public class Main{
    public static int retornaMaior(int[]vetor){
        int maior = vetor[0];
        for(int num: vetor){
            if(num>maior){
                maior=num;
            }
        }
        return maior;
    }
    public static int retornaMenor(int[]vetor){
        int menor =vetor[0];
        for(int num : vetor){
            if (num <menor){
                menor =num;
            }
        }
        return menor;
    }
    public static double retornaMedia(int[]vetor){
        int max= retornaMaior(vetor);
        int min= retornaMenor(vetor);
        return (max + min)/2.0;
        
    }
    public static void main(String[]args){
        int[] dados={29,18,21,6,13,5};
        System.out.println("Maior: "+retornaMaior(dados));
        System.out.println("Menor: "+retornaMenor(dados));
        System.out.println("Média: "+retornaMedia(dados));
    }
}
