import java.util.Scanner;

public class DeleteNumberInArray {
    public static void main(String[] args) {
        int[] arrayNumbers = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int indexX;
        int delX;

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to show in array : ");
        indexX = input.nextInt();
        int index = findIndex(arrayNumbers, indexX);
        System.out.println("Position of " + indexX + " is : " + index);

        System.out.print("Input index of number to need delete : ");
        delX = input.nextInt();

        deleteNumber(arrayNumbers, delX);

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(" " + arrayNumbers[i]);
        }
    }

    public static int findIndex(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }

    public static void deleteNumber(int[] array, int indexX) {
        if (indexX >= 0 && indexX < array.length) {
            for (int i = indexX; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
        }
    }
}
