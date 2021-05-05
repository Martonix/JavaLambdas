import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReference {

    public static void main(String[] args) {
        //method reference
        doSomething("mato", System.out::println);
        //lambda
        doSomething("peto", a -> System.out.println(a));
        //method reference
        sumIt(10,20, UtilClass::sumIt);

        //lambda calling
        sumIt(20,20, (a,b) -> UtilClass.sumIt(a,b));
    }

    public static <T> void doSomething(T item, Consumer<T> consumer){
        consumer.accept(item);
    }

    public static void sumIt(int a, int b, BiConsumer<Integer, Integer> biConsumer){
        biConsumer.accept(a,b);
    }
}
