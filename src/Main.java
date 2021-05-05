public class Main {

    public static void main(String[] args) {

        Lambdaexample priklad = (int a, int b) -> {
            if(b == 0) return 0;

            return a/b;
        };
       double vysledok = priklad.example(1657,387);
        System.out.println(vysledok);
    }



    interface Lambdaexample{
         double example(int x, int y);
    }
}
