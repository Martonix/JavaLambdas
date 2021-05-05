public class ThisRefecence {

    public static void main(String[] args) {
        ThisRefecence thisRefecence = new ThisRefecence();
/*
        thisRefecence.callProcess(1, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "we are in process";
            }
        });*/

        thisRefecence.callProcess(1, i -> {
            System.out.println(i);
          //  System.out.println(this);
        });

        thisRefecence.callIt();

    }

     public void callProcess(int i, Process process){
        process.process(i);
     }

     public void callIt(){
        callProcess(1, i -> {
            System.out.println(i);
            System.out.println(this);
        });
    }

     interface Process{
        void process(int i);
     }
}
