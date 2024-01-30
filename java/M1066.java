import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class M1066 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        for (int c = 1; c <= 5; c++) {
            int entrada = scan.nextInt();
            if(entrada > 0){
                positivos += 1;
            }
            if(entrada < 0){
                negativos += 1;
            }
            if(entrada % 2 == 0){
                pares += 1;
            }else{
                impares += 1;
            }
        }
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) prositivo(s)\n%d valor(es) negativo(s)\n",pares,impares,positivos,negativos);
    }
}