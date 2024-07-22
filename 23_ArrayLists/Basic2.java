import java.util.ArrayList;
import java.util.Collections;

public class Basic2 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Swap 2 Numbers
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);

        // Sorting an ArrayList
        Collections.sort(list); // ascending
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // Comparator - fnx logic

        // Multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        // mainList.add(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(2);
        // arr2.add(4);
        // arr2.add(6);
        // arr2.add(8);
        // arr2.add(10);
        // mainList.add(arr2);

        ArrayList<Integer> arr3 = new ArrayList<>();
        // arr3.add(3);
        // arr3.add(6);
        // arr3.add(9);
        // arr3.add(12);
        // arr3.add(15);
        // mainList.add(arr3);

        for (int i = 1; i <= 5; i++) {
            arr.add(i * 1);
            arr2.add(i * 2);
            arr3.add(i * 3);
        }
        mainList.add(arr);
        mainList.add(arr2);
        mainList.add(arr3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}
