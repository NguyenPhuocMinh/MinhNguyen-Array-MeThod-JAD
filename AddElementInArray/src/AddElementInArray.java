import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arrayNumbers = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int soX;
        int indexX;
        Scanner input = new Scanner(System.in);

        System.out.print("Số x muốn thêm vào mảng : ");
        soX = input.nextInt();

        System.out.print("Nhập vị trí của muốn thêm x : ");
        indexX = input.nextInt();

        if (indexX <= 1 && indexX >= arrayNumbers.length - 1) {
            System.out.println("Không chèn x vào phần tử của mảng");
        }

        insertIndexOfArray(arrayNumbers, indexX, soX);

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(" " + arrayNumbers[i]);
        }
    }

    public static void insertIndexOfArray(int[] array, int index, int x) {
        int size = 9;
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = x;
        size++;
    }
}
