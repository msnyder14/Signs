/**
 * This class accepts a binary digit string and converts
 * to other number systems.
 * @author Mark Snyder
 * @version 1.0
 */
public class Signs {
    /**
     * This is the main entry point for the program.
     * @param args First array entry should be a string of 1-16 1's and 0's
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Signs <binaryString>");
            return;
        }
        String binaryString = args[0];
        if (binaryString.length() > 16) {
            System.out.println("Binary string is too long");
            return;
        }
        int parsedValue = Integer.parseInt(binaryString, 2);
        System.out.println("Binary: " + Integer.toBinaryString(parsedValue));
        System.out.println("Decimal: " + parsedValue);
        System.out.println("Octal: " + Integer.toOctalString(parsedValue));
        System.out.println("Hexadecimal: " + Integer.toHexString(parsedValue));
    }
}

