package centreOfTriangle;

public class Main {
    public static void main(String[] args) {
        int []a = {4,6};
        int []b = {12,4};
        int []c = {10,10};
        System.out.println(barTriang(a,b,c)[0] +" " + barTriang(a,b,c)[1]);
    }

    public static double[] barTriang (int[] a, int[] b, int[] c){
        return new double[]{Math.round((a[0] + b[0] + c[0]) / 3.0*10000)/10000., Math.round((a[1] + b[1] + c[1]) / 3.0*10000)/10000.};


    }
}


