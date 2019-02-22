import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int size;
        int[] arrayNumber;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a size : ");
            size = input.nextInt();
            if(size > 30){
                System.out.println("should not exceed 30");
            }
        }while(size > 30);

        arrayNumber = new int[size];

        for(int i = 0; i < arrayNumber.length; i ++){
            System.out.print("Enter a number you want : " + (i + 1) + " : ");
            arrayNumber[i] = input.nextInt();
        }
        int findMin = minValue(arrayNumber);
        System.out.println("Min is : " + findMin);
    }

    public static int minValue(int[] array){
        int minValue = array[0];
        for(int i = 0; i < array.length; i ++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
