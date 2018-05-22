package Decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CompareMain {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < 100; i++) {
            arr.add(r.nextInt());
        }
        ComparatorDecorator<Integer> comp = new ComparatorDecorator<Integer>(Comparator.naturalOrder());
        Collections.sort(arr, comp);

        System.out.println(comp.getCount());

        comp.reset();
    }
}
