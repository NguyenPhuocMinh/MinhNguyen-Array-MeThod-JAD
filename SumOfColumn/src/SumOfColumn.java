import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + matrix.length + " row and " + matrix[0].length + " column :");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(" " + matrix[row][column]);
            }
            System.out.println();
        }

        int choice;
        int total = 0;

        while (true) {
            System.out.print("Input column you want sum : ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    for(int row = 0; row < matrix.length; row ++){
                        total += matrix[row][0];
                    }
                        System.out.println("Sum for column is : " + total);
                    break;
                case 1:
                    for(int row = 0; row < matrix.length; row ++){
                        total += matrix[row][1];
                    }
                    System.out.println("Sum for column is : " + total);
                    break;
                case 2:
                    for(int row = 0; row < matrix.length; row ++){
                        total += matrix[row][2];
                    }
                    System.out.println("Sum for column is : " + total);
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Not column");
            }
        }
    }
}
