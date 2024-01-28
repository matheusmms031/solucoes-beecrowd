import java.io.IOException;



public class M1097 {

    public static void main(String[] args) throws IOException {
        int count = 0;
        for(int n1 = 1; n1 <= 9; n1+= 2){
            for(int n2 = 7+count; n2 >= 5+count; n2--){
                System.out.printf("I=%d J=%d\n",n1,n2);
            }
            count += 2;
        }
    }

}
