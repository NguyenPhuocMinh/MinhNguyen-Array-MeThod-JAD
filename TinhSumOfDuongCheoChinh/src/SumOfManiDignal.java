import java.util.Scanner;

public class SumOfManiDignal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // vì ma trận hình vuông thì bậc của nó bằng nhau
        System.out.println("Nhập bậc n của ma trận : ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        // nhập phần tử vào ma trận
        System.out.print("Nhập phần tử của ma trận :");
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(" ");
                array[row][column] = input.nextInt();
            }
        }
        // in ma trận
        System.out.println("Ma trận vừa nhập : ");
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(" " + array[row][column]);
            }
            System.out.println();
        }
        // xử lí tổng đường chéo chính của ma trận
        int sum = 0;
        for(int row = 0; row < n; row ++){
            for (int column = 0; column < n; column++){
                if(row == column){
                    sum += array[row][column];
                }
            }
        }
        System.out.println("Sum for : " + sum);
    }
}
