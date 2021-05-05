public class ClosureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
/*
        addToIt(a, new Process() {
            @Override
            public void process(int i) {

                System.out.println(i);
            }
        });
*/
        addToIt(a, i -> System.out.println(i+b));
    }


    private static void addToIt(int i, Process process){
        process.process(i);
    }


    interface Process{
        void process(int i);
    }
}
