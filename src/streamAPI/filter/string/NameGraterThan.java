package streamAPI.filter.string;

import java.util.List;

public class NameGraterThan {
    public static void main(String[] args) {
        List<String> names =
                List.of("Ankit", "Pankaj", "Mahendra", "sanjay", "Saurabh");
        List<String> result=names.stream().filter(n->n.length()>5).toList();
        System.out.println(result);
    }
}
