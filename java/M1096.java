import java.io.IOException;



public class M1096 {

    public static void main(String[] args) throws IOException {
        for(int n1 = 1; n1 <= 9; n1+= 2){
            for(int n2 = 7; n2 >= 5; n2--){
                System.out.printf("I=%d J=%d\n",n1,n2);
            }
        }
    }

}
