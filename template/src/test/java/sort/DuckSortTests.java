package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class DuckSortTests {

    @Test
    public void duckSort() {
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new Duck("Daffy", 8));
        duckList.add(new Duck("Dewey", 2));
        duckList.add(new Duck("Howard", 7));
        duckList.add(new Duck("Louie", 2));
        duckList.add(new Duck("Donald", 10));
        duckList.add(new Duck("Huey", 2));

        System.out.println("Before sorting:");
        display(duckList);

        Collections.sort(duckList);

        System.out.println("\nAfter sorting:");
        display(duckList);
    }

    private void display(List<Duck> list) {
        for (Duck duck : list) {
            System.out.println(duck);
        }
    }
}
