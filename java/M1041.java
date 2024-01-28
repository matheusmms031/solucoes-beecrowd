import java.io.IOException;
import java.util.Scanner;


public class M1041 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] entrada = scan.nextLine().split(" ");
        float x = Float.parseFloat(entrada[0]);
        float y = Float.parseFloat(entrada[1]);
        if(x > 0){
            if(y < 0){
                System.out.println("Q4");
            }
            if(y > 0){
                System.out.println("Q1");
            }
            if(y == 0){
                System.out.println("Eixo X");
            }

        }
        if(x < 0){
            if(y < 0){
                System.out.println("Q3");
            }
            if(y > 0){
                System.out.println("Q2");
            }
            if(y == 0){
                System.out.println("Eixo X");
            }

        }
        if(x == 0){
            if(y != 0){
                System.out.println("Eixo Y");
            }
            else{
                System.out.println("Origem");
            }

        }
    }

}
