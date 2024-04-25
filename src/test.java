import java.util.regex.Matcher;
import java.util.regex.Pattern;

class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}