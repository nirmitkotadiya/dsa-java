import java.util.ArrayList;

public class Pair_Sum {
    // Brute Force
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 Pointer
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(rp) + list.get(lp) == target) {
                return true;
            } else if (list.get(rp) + list.get(lp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    // Pair Sum - 2 => O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // smallest
        int rp = bp; // largest
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // case 3
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 9;
        System.out.println(pairSum(list, target));
        System.out.println(pairSum1(list, target));

        ArrayList<Integer> list2 = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target2 = 16;
        System.out.println(pairSum2(list2, target2));
    }
}