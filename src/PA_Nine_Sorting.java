import java.util.Arrays;

public class PA_Nine_Sorting {
    public static void main(String[] args) {
        int[] arrs = {13, 5, 7, 68, 2};
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
        System.out.println("Smallest Number is " + arrs[0]);
        System.out.println("Biggest Number is " + arrs[arrs.length - 1]);
    }
}
