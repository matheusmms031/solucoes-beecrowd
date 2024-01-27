import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class 1050 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> dicionario = new HashMap<>() {{
            put(61,"Brasilia");
            put(71,"Salvador");
            put(11,"Sao Paulo");
            put(21, "Rio de Janeiro");
            put(32, "Juiz de Fora");
            put(19, "Campinas");
            put(27, "Vitoria");
            put(31, "Belo Holorizonte");
        }};
        int entrada = scan.nextInt();
        if(dicionario.get(entrada) != null){
            System.out.println(dicionario.get(entrada));
        }
        else{
            System.out.println("DDD nao cadastrado");
        }

    }

}
