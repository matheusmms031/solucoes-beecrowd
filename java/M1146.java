import java.io.IOException;
import java.util.Scanner;


public class M1145 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 1;
        String mensagem = "";
        while(n != 0){
            String atual = "";
            n = scan.nextInt();
            for(int c = 0; c <= n; c++){
                atual += String.format("%d ",c);
            }
            mensagem = atual.strip();
            mensagem += "\n";

        }
        System.out.println(mensagem);
    }

}