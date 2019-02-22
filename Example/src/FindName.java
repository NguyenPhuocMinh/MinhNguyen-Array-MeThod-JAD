import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] nameArray = {"Minh","Nam","Thảo","Thắng"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Name : ");
        String name = sc.nextLine();

        int index = findNameInArray(nameArray, name);
        System.out.println(index);
    }

    public static int findNameInArray(String[] array, String name){
         int indexName = -1;
        for (int i = 0; i < array.length; i ++){
            if(array[i] != null && array[i].equals(name)){
                indexName = i;
            }
        }
        return indexName;
    }
}
