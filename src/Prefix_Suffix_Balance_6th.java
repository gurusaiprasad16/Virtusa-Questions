import java.util.Scanner;

public class Prefix_Suffix_Balance_6th
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // Calculate and print the result
        int[] resultArray = prefixSuffixBalance(arr);
        System.out.print("Result Array: [");
        for (int i = 0; i < resultArray.length; i++)
        {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    static int[] prefixSuffixBalance(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[n];
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int value : arr) {
            totalSum += value;
        }
        // Initialize prefixSum and suffixSum to 0
        int prefixSum = 0;
        int suffixSum = 0;
        for (int i = 0; i < n; i++) {
            // Update suffixSum by subtracting the current element
            suffixSum = totalSum - prefixSum;
            // Calculate the absolute difference between prefixSum and suffixSum
            result[i] = Math.abs(prefixSum - suffixSum);
            // Update prefixSum by adding the current element
            prefixSum += arr[i];
        }
        return result;
    }
}
