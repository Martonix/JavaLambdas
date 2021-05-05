import java.util.Arrays;
import java.util.List;

public class exercise {

    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(2,9,5,3,2,7,9,36,23,4,387,32);

        System.out.println(average(list));


    }



    public static double average(List<Integer> list) {


        double avg = 0;
        double sum = 0;
        int size = list.size();
       for(Integer num : list){
           sum += num;
       }
        return sum / size;
    }
}
