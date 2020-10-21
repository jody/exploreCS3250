/**
 * Combined driver for explorations.
 *
 * @author Dr. Jody Paul
 * @version 1.0
 */
public class Demo {
    /**
     * Combined driver that invokes individual
     * driver methods in exploration classes.
     * @param args ignored
     */
    public static void main(final String[] args) {
        System.out.println("CS3250Random");
        CS3250Random.main(null);
        System.out.println("\n\nCS3250Static");
        CS3250Static.main(null);
    }
}
