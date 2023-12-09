import java.util.Scanner;
public class What_is_X_13th
{
    public static int findOriginalInteger(int Z1, int Z2, int Z3) {
        // Reverse the operations
        int X1 = (Z1 - 5) / 2;
        int X2 = (Z2 - 5) / 2;
        int X3 = (Z3 - 5) / 2;
        // Convert X1, X2, and X3 to binary
        String X1Binary = Integer.toBinaryString(X1);
        String X2Binary = Integer.toBinaryString(X2);
        String X3Binary = Integer.toBinaryString(X3);
        // Find the bit positions where Bruce toggled the bits
        StringBuilder bitPositions = new StringBuilder();
        int maxLength = Math.max(Math.max(X1Binary.length(), X2Binary.length()), X3Binary.length());
        for (int i = 0; i < maxLength; i++)
        {
            int bitX1 = (i < X1Binary.length()) ? Character.getNumericValue(X1Binary.charAt(X1Binary.length() - 1 - i)) : 0;
            int bitX2 = (i < X2Binary.length()) ? Character.getNumericValue(X2Binary.charAt(X2Binary.length() - 1 - i)) : 0;
            int bitX3 = (i < X3Binary.length()) ? Character.getNumericValue(X3Binary.charAt(X3Binary.length() - 1 - i)) : 0;
            // Find the bit that was toggled
            int toggledBit = (bitX1 + bitX2 + bitX3) % 2;
            bitPositions.insert(0, toggledBit);
        }
        // Reverse the binary and convert to decimal
        int originalInteger = Integer.parseInt(bitPositions.toString(), 2);
        return originalInteger;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for Z1: ");
        int Z1 = scanner.nextInt();
        System.out.print("Enter the value for Z2: ");
        int Z2 = scanner.nextInt();
        System.out.print("Enter the value for Z3: ");
        int Z3 = scanner.nextInt();
        int result = findOriginalInteger(Z1, Z2, Z3);
        System.out.println("The original integer X is: " + result);
    }
}