package objectclass.ancestor;

import controladvanced.labels.Labels;
import stringconcat.nameconcat.Name;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();

        Fruit fruit = new Fruit();
        objects.add(fruit);

        Apple apple = new Apple();
        objects.add(apple);

        Starking starking = new Starking();
        objects.add(starking);

        Vegetable vegetable = new Vegetable();
        objects.add(vegetable);

        objects.add("alma");
        objects.add(12);
        objects.add('x');

        LocalDate localDate = LocalDate.of(2021, 12, 03);
        objects.add(localDate);

        int[] numbers = {1, 58, 8, 96, 9, 9,};
        objects.add(numbers);

        List<String> list = Arrays.asList("dsf", "dfg", "ilz", "ttt");
        objects.add(list);

        System.out.println(objects);
    }
}
