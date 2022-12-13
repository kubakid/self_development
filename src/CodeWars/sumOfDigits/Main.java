package CodeWars.sumOfDigits;

public class Main {
    public static void main(String[] args) {
        System.out.println(digital_root(12398));
        System.out.println(digital_root1(12398));
    }

    public static int digital_root(int n) {
        int sum = 0;
        while (n > 9){
            while (n > 0){
                sum += n%10;
                n/= 10;
            }
            n = sum;
            if (n < 10)
                return n;
            sum = 0;
        }
        return 0;
    }

    public static int digital_root1(int n) {
        return (1 + (n - 1) % 9);
    }
}
