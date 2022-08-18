package CompatorInterface;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);


        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //DEscending order
        Collections.sort(list,new MyCompator());
        System.out.println(list);

        Collections.sort(list, (o1,o2) -> ((o1>o2) ? -1 :(o2<o1) ? 1 : 0));
        System.out.println(list);

        //Ascending
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending
        list.sort((o2,o1) -> (o1.compareTo(o2)));
        System.out.println(list);


        List<Apple> myInventory = Arrays.asList(
                new Apple(120, Color.GREEN),
                new Apple(150, Color.RED),
                new Apple(200, Color.GREEN),
                new Apple(148, Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing((apple -> apple.getWeight())));
        myInventory.sort(comparing(Apple::getWeight));

        //Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //Chaining
        myInventory
                .sort(comparing(Apple::getColor)
                        .reversed()
                            .thenComparing(Apple::getWeight));
        System.out.println(myInventory);





    }

}
