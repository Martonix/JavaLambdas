
public class LambdaInnerExample {

    public static void main(String[] args) {

        ILambda lambda = () -> System.out.println("Something from inner class");

        ILambda lambda2 = new ILambda() {
            @Override
            public void print() {
                System.out.println("Something else from inner class but not lambda style");
            }
        };



        printIt(lambda);
        printIt(lambda2);
    }


    public static void printIt(ILambda lambda){
        lambda.print();
    }
}
