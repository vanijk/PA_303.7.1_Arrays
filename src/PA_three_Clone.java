import java.util.Arrays;

public class PA_three_Clone {
    public static void main(String[] args) {
        String[] arr_one = {"red","green","blue","yellow" };
        String[] arr_two = arr_one.clone();

        if(Arrays.toString(arr_one).equals(Arrays.toString(arr_two)))
            System.out.println("Both Arrays are equal");
    }
}
