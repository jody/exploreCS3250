import java.lang.reflect.Field;
/**
 * Exploration of static blocks.
 * @author Dr. Jody Paul
 * @version 20201021
 */
public class CS3250Static {
    // Note that this source code intentionally
    // does not follow good programming practices.
    /**
     * Demonstration driver.
     * @param args ignored
     */
    public static void main(final String[] args) {
        String s = new String("Hello");
        String r = " pardner.";
        System.out.println("S1: " + s + r);
        System.out.println("S2: s.equals(\"Hello\") --> "
                             + (s.equals("Hello")));
        System.out.println("S3: s --> " + s);
    }
    static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello", value.get("Howdy"));
        } catch (Exception e) { }
    }
}
