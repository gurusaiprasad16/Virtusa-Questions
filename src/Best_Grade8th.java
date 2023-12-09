import java.util.Arrays;
public class Best_Grade8th {

    public static String findBestGrade(String grades, int andrewPosition, int k) {
        char[] andrewGrade = grades.toCharArray();
        char[] possibleGrades = new char[26 * andrewGrade.length];
        int index = 0;
        for (int i = 0; i < andrewGrade.length; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                char[] newGrade = andrewGrade.clone();
                newGrade[i] = j;
                possibleGrades[index++] = new String(newGrade).toCharArray()[0];
            }
        }
        Arrays.sort(possibleGrades);
        char bestGrade = possibleGrades[0];
        for (int i = 0; i < possibleGrades.length && i <= k && possibleGrades[i] <= grades.charAt(andrewPosition - 2); i++) {
            if (possibleGrades[i] > bestGrade) {
                bestGrade = possibleGrades[i];
            }
        }
        if (bestGrade == andrewGrade[andrewPosition - 1]) {
            return new String(andrewGrade);
        } else {
            andrewGrade[andrewPosition - 1] = bestGrade;
            return new String(andrewGrade) + grades.charAt(andrewPosition - 2);
        }
    }
    public static void main(String[] args) {
        String grades = "DOLL";
        int andrewPosition = 3;
        int k = 1;
        String bestGrade = findBestGrade(grades, andrewPosition, k);
        System.out.println(bestGrade);
    }
}