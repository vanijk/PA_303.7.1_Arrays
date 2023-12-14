public class PA_seven {
    public static void main(String[] args) {
        int[] arrs = {13, 5, 7, 68, 2};
        int middleNum = arrs.length / 2;
        for(int i =0 ; i < arrs.length; i++ ) {
            if(i != middleNum)
            System.out.println(arrs[i]);
        }
    }
}
