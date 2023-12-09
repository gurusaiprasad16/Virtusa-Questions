import java.util.Scanner;

public class Ant_On_Rail_5th {
    public static void main(String[] args) {
        System.out.println(solution());
    }
    static int solution()
    {
        int count = 0;	//counting no of times of ants returned back to original position
        Scanner sc = new Scanner(System.in);
        // No of moves made by ant
        System.out.println("No of moves made by ant:");
        int n = sc.nextInt();
        //An integer A. consisting of the ant's moves towards either side. conside this line after reading the question fully.
        System.out.println("Enter ant's moves as a space-separated list:");
        int A[] = new int[n];
        for (int index = 0; index < n; index++)
        {
            A[index] = sc.nextInt();
        }
        int sum = 0; // this will add the ant moves for both sideS
        for (int move = 0; move < A.length; move++)
        {
            sum += A[move];
            if(sum == 0)
            {
                count++;
            }
        }
        return count;
    }
}