import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        // Java Collection Framework
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(2); // O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        System.out.println("Size = " + list.size());
        // O(n)

        // print the arrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Print Reverse of an ArrayList - O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Find Maximum in an ArrayList
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > MAX) {
            // MAX = list.get(i);
            // }
            MAX = Math.max(MAX, list.get(i));
        }
        System.out.println("MAX = " + MAX);
        list.add(1, 9);

        System.out.println(list);

        // Get Operation
        System.out.println(list.get(1));

        // Delete
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(0, 23);
        System.out.println(list);

        // contains element
        System.out.println(list.contains(2));
    }
}
