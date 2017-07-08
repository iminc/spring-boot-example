import com.google.common.base.Joiner;

/**
 * Created by jim on 17-6-3.
 */
public class Test {
    public static void main(String[] args) {
        System.out.printf(Joiner.on(',').join(new String[]{"a", "b"}));
    }
}
