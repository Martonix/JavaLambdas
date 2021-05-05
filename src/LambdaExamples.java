public class LambdaExamples {

    public static void main(String[] args) {

        LambdaE lambda = a -> a*5;


        multipli(lambda);
    }


    interface LambdaE{
        int multiplication(int x);
    }

    public static void multipli(LambdaE multiplication){

        System.out.println(multiplication.multiplication(10));
    }


}
