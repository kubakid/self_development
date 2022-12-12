package countBits;

public class Main {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
    public static int countBits(int n) {
        String[] bin = Integer.toBinaryString(n).split("");
        int counter = 0;
        for (String i : bin){
            if (i.equals("1"))
                counter++;
        }
        return counter;
    }
}
