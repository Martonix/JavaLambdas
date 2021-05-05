import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class LambdaEx2oprava {

        public static void main(String[] args) {

            List<String> mesta = Arrays.asList("Banska Bystrica", "prešov", "levoce", "Banska štiavnica", "liptovsky mikulas");

            Collections.sort(mesta, (String o1, String o2) -> o1.compareTo(o2));
            printMesta(mesta);


            printFilterMiest(mesta, s -> !s.contains(" "));

            printFilterMiest(mesta, str -> str.startsWith("B"));
        }

            private static void printFilterMiest(List<String> mesta, LambdaEx2oprava.Filter filter){
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



