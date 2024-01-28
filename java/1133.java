import java.io.IOException;
import java.util.Scanner;


public class 1133 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int maior;
        int menor;
        if(n1 > n2) {
            maior = n1;
            menor = n2;
        }else{
            maior = n2;
            menor = n1;
        }

        for(int c = menor; c < maior; c++){
            if(c > 2 & (c % 5 == 2 | c % 5 == 3)){
                System.out.println(c);
            }
        }
    }

}

