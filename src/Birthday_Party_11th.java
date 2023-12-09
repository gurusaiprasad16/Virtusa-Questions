import java.util.Scanner;
public class Birthday_Party_11th
{
    // Function to calculate GCD
    private static int gcd(int a, int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Function to find the maximum number of people attending the party
    private static int maxPeopleAttendingParty(int N, int M) {
        // Calculate GCD of N and M
        int gcdValue = gcd(N, M);
        // Maximum number of people with equal pieces of each type of cake
        int maxPeople = gcdValue;
        return maxPeople;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pieces for the first cake: ");
        int N = scanner.nextInt();
        System.out.print("Enter the number of pieces for the second cake: ");
        int M = scanner.nextInt();
        int result = maxPeopleAttendingParty(N, M);
        System.out.println("The maximum number of people attending the party is: " + result);
    }
}