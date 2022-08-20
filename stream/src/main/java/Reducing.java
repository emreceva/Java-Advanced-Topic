import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,5,6,8,9,4);
        int result = numbers.stream().reduce(0,(a,b) ->(a+b));
        System.out.println("result = " + result);

        //No initial value
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> (a+b));
        System.out.println("result2 = " + result2);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("result5 = " + min.get());
        System.out.println("result3 = " + max.get());
        System.out.println("result4 = " + sum.get());

        //Task
        int dishCount1 = DishData.getAll().stream().map(d-> 1).reduce(0,(a,b)->(a+b));
        System.out.println("dishCount1 = " + dishCount1);

        long dishCount2 = DishData.getAll().stream().count();
        System.out.println("dishCount2 = " + dishCount2);






    }
}
