import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;


public class 1043 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] entrada = scan.nextLine().split(" ");
        float[] lados = new float[3];
        Integer contador = 0;
        for(String elemento: entrada){
            lados[contador] = Float.parseFloat(elemento);
            contador += 1;
        }
        float[] lados_organizados = Arrays.copyOf(lados,3);
        Arrays.sort(lados_organizados);
        float perimetro = lados[0]+lados[1]+lados[2];
        float semiperimetro = perimetro/2;
        if(lados_organizados[0] + lados_organizados[1] > lados_organizados[2]){
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }
        else{
            System.out.printf("Area = %.1f\n",((lados[0]+lados[1])*lados[2])/2);
        }
    }

}
