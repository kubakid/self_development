package highAndLow;

public class Main {
    public static String highAndLow(String numbers) {
        String[] num = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String i : num){
            if (Integer.parseInt(i) > max)
                max = Integer.parseInt(i);
            if (Integer.parseInt(i) < min)
                min = Integer.parseInt(i);
        }
        return max + " " + min;
    }
}
