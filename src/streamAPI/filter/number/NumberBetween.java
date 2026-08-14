package streamAPI.filter.number;

import java.util.List;

public class NumberBetween {
    //stream.filter(condition)
    public static void main(String[] args) {
        List<Integer> list=List.of(10, 15, 20, 25, 30,55,67,89,99,94,82,55,64);
        List<Integer> result=list.stream().filter(n->n>40 && n<80).toList();
        System.out.println(result);
    }
}
