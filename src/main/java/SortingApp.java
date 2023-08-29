import java.util.Arrays;

public class SortingApp {
    public void sort(int[] data) {
        if (data.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }


        Arrays.sort(data);
        System.out.print("Sorted numbers: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
