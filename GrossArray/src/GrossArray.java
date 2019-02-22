import java.util.Scanner;

public class GrossArray {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number for arrayA : ");

        for (int i = 0; i < arrayA.length; i ++){
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Input a number for arrayB : ");

        for(int i = 0; i < arrayB.length; i ++){
            arrayB[i] = sc.nextInt();
        }

        int [] arrayC = new int[10];

        for(int i = 0; i < arrayA.length; i ++){
            arrayC[i] = arrayA[i];
            arrayC[arrayA.length + i] = arrayB[i];
        }

        for (int i = 0; i < arrayC.length;i ++){
            System.out.print(" " + arrayC[i]);
        }

    }

}
