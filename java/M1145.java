import java.io.IOException;
import java.util.Scanner;


public class M1145 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] entrada = scan.nextLine().split(" ");
        int x = Integer.parseInt(entrada[0]);
        int y = Integer.parseInt(entrada[1]);
        String mensagem = "";
        int count = 0;
        for(int c = 1; c <= y; c++){
            count += 1;
            mensagem += String.format("%d ",c);
            if(count == x){
              mensagem.strip();
              System.out.println(mensagem);
              mensagem = "";
              count = 0;
            }
        }
    }

}