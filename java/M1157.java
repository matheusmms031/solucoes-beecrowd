import java.io.IOException;
import java.util.Scanner;


public class M1157 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        for(int c = 1; c <= n1; c++){
            if(n1 % c == 0){
                System.out.println(c);
            }
        }
    }

}