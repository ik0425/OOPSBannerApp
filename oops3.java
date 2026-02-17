
/**
 * OOPSBannerApp UC3 OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhancing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner[cite: 281, 282, 284].
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Refactoring to use String.join("", ...) to join parts of each line [cite: 225, 226, 319]
        // The delimiter is an empty string "" to join segments without extra separation [cite: 226]

        // Line 1: Top of the letters O, O, P, S
        System.out.println(String.join("", "  ***** ", " ", "  ***** ", " ", " ***** ", " ", "  ***** "));

        // Line 2
        System.out.println(String.join("", " * * ", " ", " * * ", " ", " * * ", " ", " * "));

        // Line 3
        System.out.println(String.join("", " * * ", " ", " * * ", " ", " * * ", " ", " * "));

        // Line 4: Middle section
        System.out.println(String.join("", " * * ", " ", " * * ", " ", " ***** ", " ", "  ***** "));

        // Line 5
        System.out.println(String.join("", " * * ", " ", " * * ", " ", " * ", " ", "       * "));

        // Line 6
        System.out.println(String.join("", " * * ", " ", " * * ", " ", " * ", " ", "       * "));

        // Line 7: Bottom of the letters
        System.out.println(String.join("", "  ***** ", " ", "  ***** ", " ", " * ", " ", "  ***** "));
    }
}
