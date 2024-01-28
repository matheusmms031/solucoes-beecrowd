import java.io.IOException;



public class M1095 {

    public static void main(String[] args) throws IOException {
        int n2 = 1;
        for(int n1 = 60; n1 >= 0; n1 -= 5){
            System.out.printf("I=%d J=%d\n",n2,n1);
            n2 += 3;
        }
    }

}
