import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {


    public static void main(String[] args) {

        List<String> mesta = Arrays.asList("Banska Bystrica", "prešov", "levoce", "Banska štiavnica", "liptovsky mikulas");

    //    Collections.sort(mesta, (String o1, String o2) -> o1.compareTo(o2));
    //    printMesta(mesta);


/*                  //je to škaredé
        printFilterMiest(mesta, s -> true, s -> System.out.println(s), s -> {
            try {
              s = s.toUpperCase();
            } catch(Exception e){
                e.printStackTrace();
            }
            return s;
        });*/

        printFilterMiest(mesta, str -> str.startsWith("B"), wrapperConsumer(str -> System.out.println(str)), wrapperFunction(str -> str.toLowerCase()));
    }

    private static void printFilterMiest(List<String> mesta, Predicate<String> filter, Consumer<String> consumer, Function<String, String> function){
        for (String mesto : mesta){
            if(filter.test(mesto)){
                consumer.accept(function.apply(mesto));
            }
        }
    }

    private static <T,R> Function<T, R>  wrapperFunction(Function<T, R> function){

        return s -> {
            R a = null;
            try {
            a = function.apply(s);
            }catch(Exception e){
                System.out.println("Error wrapper function");;
            }
            return a;
        };
    }

    private static Consumer<String> wrapperConsumer(Consumer<String> consumer){
        return str -> {
          try {
              consumer.accept(str);
          }catch(Exception e){
              System.out.println("Error wrapper consumer");
          }

        };
    }


    /*
    private static void printMesta(List<String> mesta){
        for(String mesto : mesta){
            System.out.println(mesto);
        }
    }
*/

/*
    interface Filter {
        boolean odFiltruj(String s);
    }*/
}
