import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePartitionsBy {
    public static void main(String args[]) {
        var list = List.of(-1,2,0,-4,6,-7,-3,9);
        Predicate<Integer> isPositive = i-> i > 0;
        Map<Boolean,List<Integer>> groups = list.stream().collect(Collectors.partitioningBy(isPositive));
        System.out.println(groups.get(true));
        System.out.println(groups.get(false));
    }
}
