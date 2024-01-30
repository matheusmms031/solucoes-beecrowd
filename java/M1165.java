import java.io.IOException;
import java.net.Inet4Address;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class M1165 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n_entradas = scan.nextInt();
        String saida = "";
        for (int c = 1; c <= n_entradas; c++) {
            int entrada = scan.nextInt();
            String ehp = primo(entrada);
            saida += String.format("%d %s\n", entrada, ehp);
        }
        System.out.print(saida);
    }
    public static String primo ( int numero){
        for (int c = 1; c <= numero; c++) {
            if ((numero % c == 0) & (c != 1 | c != numero)) {
                return "eh primo";
            }
        }
        return "nao eh primo";
    }
}