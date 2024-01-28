import java.io.IOException;
import java.util.Scanner;


public class M1132 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int soma = 0;
        int maior, menor;
        if(n1 > n2) {
            maior = n1;
            menor = n2;
        }else{
            maior = n2;
            menor = n1;
        }

        for(int c = menor; c <= maior; c++){
            if(c % 13 != 0){
                soma += c;
            }
        }
        System.out.println(soma);
    }

}
