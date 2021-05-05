import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaExample2 {

    public static void main(String[] args) {

        List<String> mesta = Arrays.asList("Banska Bystrica", "prešov", "levoce", "Banska štiavnica", "liptovsky mikulas");

        Collections.sort(mesta, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        printMesta(mesta);



        printFilterMiest(mesta, new Filter() {
            @Override
            public boolean odFiltruj(String s) {
                return !s.contains(" ");
            }
        });

        printFilterMiest(mesta, new Filter() {

            @Override
            public boolean odFiltruj(String s) {
                return s.startsWith("B");
            }
        });
    }

    private static void printFilterMiest(List<String> mesta, Filter filter){
        for (String mesto : mesta){
            if(filter.odFiltruj(mesto)){
                System.out.println(mesto);
            }
        }
    }

    private static void printMesta(List<String> mesta){
        for(String mesto : mesta){
            System.out.println(mesto);
        }
    }

    interface Filter {
        boolean odFiltruj(String s);
    }


}
