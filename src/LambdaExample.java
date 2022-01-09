import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        list.add("learn    ");
        list.add("jjj");
        list.removeIf(e -> e.length() > 5);
        Predicate<String> predicate = e -> e.length() == 3;
        Predicate<String> predicate1 = e -> e.length() == 4;
        list.removeIf(predicate.and(predicate1)); // можно подставить or
        list.removeIf(predicate.negate()); // отрицание проверки
        list.forEach(s -> System.out.println(s)); //consumer

    }
}
