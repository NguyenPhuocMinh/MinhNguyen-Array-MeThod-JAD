import java.util.Scanner;

public class FindMaxNumberIn2Array {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        // nhập số dòng số cột từ người dùng :

        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        // tạo ngẫu nhiên mảng 2 chiều:
       // for (int row = 0; row < matrix.length; row++) {
          //  for (int column = 0; column < matrix[row].length; column++) {
              //  matrix[row][column] = (int) (Math.random() * 100);
           // }
       // }

        // in mảng 2 chiều :
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        // tìm max của mảng 2 chiều :
        int maxValue = findMaxNumberInMatrix(matrix);
        System.out.println("Max is " + maxValue);

    }

    public static int findMaxNumberInMatrix(int[][] array) {
        int maxNum = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > maxNum) {
                    maxNum = array[row][column];
                }
            }
        }
        return maxNum;
    }
}
