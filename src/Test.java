import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter p){
        for(Apple apple : inventory){
            String output = p.accept(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple(Color.RED, 160));
        list.add(new Apple(Color.GREEN, 110));
        list.add(new Apple(Color.RED, 150));
        list.add(new Apple(Color.RED, 200));

        prettyPrintApple(list, new AppleWeightAndHeavyPredicate());
        System.out.println("-----------------");

        prettyPrintApple(list, new AppleFancyFormatter());
        System.out.println("-----------------");

        prettyPrintApple(list, new AppleSimpleFormatter());
        System.out.println("-----------------");
    }
}
