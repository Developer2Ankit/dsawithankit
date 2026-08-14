package streamAPI.filter.number;

import java.util.List;

public class FilterMain {
//stream.filter(condition)
    public static void main(String[] args) {
     List<Integer> list=List.of(10, 15, 20, 25, 30);
     List<Integer> result=list.stream().filter(n->n>20).toList();
     System.out.println(result);
        }
}
