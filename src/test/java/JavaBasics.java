import org.junit.jupiter.api.Test;

public class JavaBasics {
    @Test
    public void javaBasics() {
        double d = 10.70;

        String s = "10";
        int a = Integer.parseInt(s);
        System.out.println(a);

        int b = (int)d;
        float f = (float)d;
        System.out.println(b);
    }
}
