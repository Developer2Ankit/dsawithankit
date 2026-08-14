package streamAPI.filter.string;

import java.util.ArrayList;
import java.util.List;

public class Contains {
    public static void main(String[] args) {
        List<String> names =
                List.of("Ankit", "Pankaj", "Mahendra", "sanjay", "Saurabh");
        List<String> result=names.stream().filter(n->n.toLowerCase().contains("n")).toList();
        System.out.println(result);    }
}
