import java.util.ArrayList;

public class Most_Water {
    public static int storeWater(ArrayList<Integer> height) {
        int MAX = Integer.MIN_VALUE;
        // brute force - O(n^2)
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = Math.min(height.get(i), height.get(j));
                int w = j - i;
                if ((h * w) > MAX) {
                    MAX = (h * w);
                }
            }
        }
        return MAX;
    }

    // 2 pointer approach - O(n)
    public static int storeWater2(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        int currWater = 0;
        while (lp < rp) {
            // calculate water area
            int h = Math.min(height.get(rp), height.get(lp));
            int w = rp - lp;
            currWater = h * w;
            maxWater = Math.max(currWater, maxWater);

            // update ptr
            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(8);
        al.add(6);
        al.add(2);
        al.add(5);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(7);

        System.out.println("MAX = " + storeWater(al));
        System.out.println("MAX = " + storeWater2(al));

    }
}
