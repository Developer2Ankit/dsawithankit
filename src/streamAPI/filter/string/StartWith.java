package streamAPI.filter.string;

import java.util.List;

public class StartWith {
    public static void main(String[] args) {
        List<String> names =
                List.of("Ankit", "Amit", "Rahul", "Avya", "Rohit");
        List<String> result=names.stream().filter(n->n.startsWith("A")).toList();
        System.out.println(result);
    }
}
