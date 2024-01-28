import java.io.IOException;
import java.util.Scanner;


public class 1143 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        for(int c = 1; c <= n1; c++){
            System.out.printf("%d %d %d\n",c,c*c,c*c*c);
        }
    }

}





