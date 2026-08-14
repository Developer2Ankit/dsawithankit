package streamAPI.filter.number;

import java.util.List;

public class EvenNumberMain {
    //stream.filter(condition)
    public static void main(String[] args) {
        List<Integer> list=List.of(10,12,13,14,15,16,17,18,19,20, 25, 30);
        List<Integer> result=list.stream().filter(n->n%2==0).toList();
        System.out.println(result);
    }
}
