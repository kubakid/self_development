package CodeWars.splitStringIntoLetters;

public class Main {
    public static void main(String[] args) {
        System.out.println(amountOfVowels("aaabbbeiouddd"));


    }

    public static int amountOfVowels(String str) {
        String[] a = str.split("");
        int counter = 0;
        for (String s : a) {
            if (s.toLowerCase().equals("a") || s.toLowerCase().equals("e") || s.toLowerCase().equals("i") || s.toLowerCase().equals("o") || s.toLowerCase().equals("u")) {
                ++counter;
            }
        }
        return counter;
    }


    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static String even_or_odd(int number) {
        if (number % 2 == 0)
            return "Even";
        return "Odd";
    }

    public static String even_or_odd1(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}
