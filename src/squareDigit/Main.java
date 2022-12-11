package squareDigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(squareDigits(1234));
    }

    public static int squareDigits (int n){
        String[] a = Integer.toString(n).split("");
        String odp = "";
        for (String i : a){
            odp += Integer.toString(Integer.parseInt(i)*Integer.parseInt(i));
        }
        return Integer.parseInt(odp);
    }
}
