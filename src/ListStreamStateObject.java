
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListStreamStateObject {
    public static void main(String args[])  {
        List<State> stateList = Util.buildStateList();
       // stateList.stream().forEach(e-> System.out.println(e.getCode()));
            stateList.stream().filter(s-> s.getCode().startsWith("S")).forEach(t->System.out.println(t.getCode()));
            var fruitBasket = List.of("Orange","Apple","Apple","Orange","Orange");
        fruitBasket.stream().filter(f->f.equals("Orange")).collect(Collectors.counting());
    }
}
