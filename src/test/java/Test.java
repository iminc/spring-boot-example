import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jim on 17-6-3.
 */
public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("fmz");
        names.add("fzm");
        names.add("fzm2");

        Collections.sort(names, (a, b) -> b.compareTo(a));

        boolean has = names.stream().limit(2).map(String::toUpperCase).allMatch(e -> e.startsWith("f"));
        System.out.println(has);

        int a = 100_00;
        System.out.println(a);

        System.out.println(names);
    }
}
