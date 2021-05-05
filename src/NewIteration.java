import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NewIteration {

    public static void main(String[] args) {
        List<String> osoby = Arrays.asList("Peto", "Mato", "Miska", "Oliver", "Vito", "Stevo", "Viki");

        // fori iterating
        for(int i = 0; i < osoby.size(); i++){
            System.out.println(osoby.get(i));
        }

        //foreach iterating
        for(String osoba : osoby){
            System.out.println(osoba);
        }

        //method reference
        osoby.forEach(System.out::println);


        //iterating through lambda
        osoby.forEach(osoba -> System.out.println(osoba));
    }
}
