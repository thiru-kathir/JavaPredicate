import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticePredicate {
    public static void main(String args[])  {
        List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,7,8,8);
        Predicate<Integer> biggerThanFive = n -> n > 5;
       // numbers.stream().filter(biggerThanFive).forEach(System.out::println);
        List<Integer> numbersWithoutDuplicates = new ArrayList<>(new HashSet<>(numbers));
        numbersWithoutDuplicates.stream().filter(biggerThanFive).forEach(System.out::println);

    }
}
