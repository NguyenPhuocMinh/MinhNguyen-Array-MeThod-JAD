public class FindMinNumberInArray {
    public static void main(String[] args) {
        int arrayA[] = {4, 12, 7, 8, 1, 6, 9};
        int index = minNumber(arrayA);
        System.out.println("Min Number is " + arrayA[index]);
    }

    public static int minNumber(int[] array) {
        int minValue = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                index = i;
            }
        }
        return index;
    }
}
