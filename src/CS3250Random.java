import java.util.Random;
/**
 * Exploration of peculiar and random things.
 * @author Dr. Jody Paul
 * @version 20201021
 */
public class CS3250Random {
    // Note that this source code intentionally
    // does not follow good programming practices.
    /**
     * Demonstration driver.
     * @param args ignored
     */
    public static void main(final String[] args) {
        /* Part A */
        System.out.print("A: ");
        System.out.print((long) + (char) - (int) + (byte) - 1);
        /* Part B */
        System.out.print("\nB0: ");
        Random random = new Random(320217610);
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(10) + " "); /* B1 */
        System.out.print("\nB1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(10) + " "); /* B1 */
        System.out.print("\nB2: ");
        random = new Random(441287210);
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(10) + " "); /* B1 */
        System.out.print("\nB3: ");
        random = new Random(-6732303926L);
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(10) + " "); /* B2 */
    }
}
