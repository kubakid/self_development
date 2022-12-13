package CodeWars.Trolls;

public class Main {
    public static void main(String[] args) {
        System.out.println(defend("aaaatur"));

    }

    public static String defend(String str){
        return str.replaceAll(("(?i)[aeiou]"), "");
    }
}
