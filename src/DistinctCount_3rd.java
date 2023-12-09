public class DistinctCount 
{
    public static int countDistinctK(int[] arr) 
    {
        int n = arr.length;
        int count = 0;
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] != i + 1) 
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4}; // Replace with your array
        int result = countDistinctK(arr);
        System.out.println(result);
    }
}
