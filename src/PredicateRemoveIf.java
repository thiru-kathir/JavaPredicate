import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateRemoveIf {
    public static void main(String args[]) {
        var words = new ArrayList<String>();
        words.add("thiruna");
        words.add("kathir");
        words.add("hello");
        words.add("bye");
        Predicate<String> str = s-> s.length() ==3;
        words.removeIf(str);
        System.out.println(words);
    }
}
