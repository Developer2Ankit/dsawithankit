package streamAPI.filter.string;

import java.util.List;

public class MultipleConditions {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 55, 20,36,34,46,74, 75, 90, 35,104,100,108);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 20)
                .filter(n -> n < 100)
                .toList();
        List<Integer> result2 = numbers.stream()
                .filter(n -> n % 2 == 0 && n > 20 && n < 100)
                .toList();
        System.out.println(result);
        System.out.println(result2);
    }
}
