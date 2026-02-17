/**
 * OOPSBannerApp UC2 Banner Display Application
 *
 * This class demonstrates the creation of a visual banner displaying the word "OOPS"
 * using ASCII art composed of asterisks (*) and spaces. The banner is printed to the
 * console using individual print statements for each line, creating a decorative
 * text effect.
 *
 * @author Developer
 * @version 2
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Constructing the OOPS banner line by line using string concatenation (+)
        // Each letter is 9 characters wide and 7 lines high 

        // Line 1: Top of the letters
        System.out.println("  ***** " + " " + "  ***** " + " " + " ***** " + " " + "  ***** ");
        
        // Line 2: Sides/Curves
        System.out.println(" * * " + " " + " * * " + " " + " * * " + " " + " * ");
        
        // Line 3: Sides/Curves
        System.out.println(" * * " + " " + " * * " + " " + " * * " + " " + " * ");
        
        // Line 4: Middle bars for P and S
        System.out.println(" * * " + " " + " * * " + " " + " ***** " + " " + "  ***** ");
        
        // Line 5: Bottom sides
        System.out.println(" * * " + " " + " * * " + " " + " * " + " " + "       * ");
        
        // Line 6: Bottom sides
        System.out.println(" * * " + " " + " * * " + " " + " * " + " " + "       * ");
        
        // Line 7: Bottom of the letters
        System.out.println("  ***** " + " " + "  ***** " + " " + " * " + " " + "  ***** ");
    }
}