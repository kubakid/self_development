package CodeWars.findOdd;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(findOdd(a));

    }

    public static int findOdd(int[] a) {
        for (int i : a) {
            int count = 0;
            for (int k : a) {
                if (i == k)
                    count++;
            }
            if (count % 2 == 1) {
                return i;
            }
        }
        return 0;
    }
}
