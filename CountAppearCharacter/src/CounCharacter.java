import java.util.Scanner;

public class CounCharacter {
    public static void main(String[] args) {
        String[] arrayCharacter = {"a", "a", "a", "a"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input charcter you want count : ");
        String charcter = sc.nextLine();

        int result = countChar(arrayCharacter, charcter);
        System.out.println("Character you want count is :" + result);

    }

    public static int countChar(String[] array, String c) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(c)) {
                count++;
            }
        }
        return count;
    }
}
