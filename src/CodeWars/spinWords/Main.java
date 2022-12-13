package CodeWars.spinWords;

public class Main {
    public static void main(String[] args){
        System.out.println(spinWords("Welcome"));

    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            if (words[i].length() > 4){
                String[] j = words[i].split("");
                for (int k = 0; k < j.length/2; k++){
                    String pom = j[k];
                    j[k] = j[j.length - k - 1];
                    j[j.length - k - 1] = pom;
                }
                String zam = "";
                for (String k : j){
                    zam += k;
                }
                words[i] = zam;
            }
        }

    String odp = "";
    for (int i = 0; i < words.length - 1; i++){
        odp += words[i] + " ";
    }
    odp += words[words.length-1];
    return odp;
    }


    public String spinWords1(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
