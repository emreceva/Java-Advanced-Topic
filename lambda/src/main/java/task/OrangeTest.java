package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.GREEN));

        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());


        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
        //prettyPrintApple(inventory,simpleFormatter);

        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + "g");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A" + characteristic + orange.getColor() + "orange";
        };

    }
    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orrangeFormatter){
        for(Orange orange : inventory){
            String output = orrangeFormatter.accept(orange);
            System.out.println(output);
        }


    }
}
