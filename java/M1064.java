import java.io.IOException;
import java.util.Scanner;


public class M1064 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float[] numeros = new float[6];
        int quantidade_inteiros = 0;
        for(int c = 0; c < 6; c++){
            numeros[c] = scan.nextFloat();
            if(numeros[c] > 0){
                quantidade_inteiros += 1;
            }
        }
        float[] numeros_positivos = new float[quantidade_inteiros];
        int c = 0;
        for(float numero : numeros){
            if(numero > 0){
                numeros_positivos[c] = numero;
                c += 1;
            }
        }
        float soma = 0;
        for(float numero: numeros_positivos){
            soma += numero;
        }
        System.out.printf("%d valores positivos\n%.1f\n",quantidade_inteiros,soma/quantidade_inteiros);

    }

}
