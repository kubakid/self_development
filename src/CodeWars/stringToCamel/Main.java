package CodeWars.stringToCamel;

public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCase("nie-ma"));
    }

    static String toCamelCase(String s){
        if (s.equals("")){
            return "";
        }
        boolean which = s.contains("-");
        String[] words;
        if (which)
            words = s.split("-");
        else
            words = s.split("_");
        String odp = "";
        for (String i : words){
            odp += i.substring(0,1).toUpperCase() + i.substring(1);
        }
        if (s.substring(0,1).equals(odp.substring(0,1)))
            return odp;
        else
            return odp.substring(0,1).toLowerCase() + odp.substring(1);
    }
}

