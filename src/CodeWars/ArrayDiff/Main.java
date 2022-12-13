package CodeWars.ArrayDiff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static int[] arrayDiff(int[] a, int[] b) {
        int counter = 0;
        for (int i : a){
            boolean isUnique = true;
            for (int j : b){
                if ( i == j){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                counter++;
        }
        if (counter > 0){
            int [] unique = new int[counter];
            counter = 0;
            for (int i : a){
                boolean isUnique = true;
                for (int j : b){
                    if ( i == j){
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    unique[counter] = i;
                    counter++;
                }
            }
            return unique;
        }
        return new int[]{};
    }


    public static int[] arrayDiff1(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().toList();
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
