public class PA_Eight {
    public static void main(String[] args) {
        int[] arrs = {13, 5, 7, 68, 2};
        int middleNum = arrs.length / 2;
        for(int i =0 ; i < arrs.length; i++ ) {
            System.out.print(arrs[i]+" ");
        }
        arrs[0] = arrs[middleNum];
        System.out.print("\n");
        for(int i =0 ; i < arrs.length; i++ ) {
                System.out.print(arrs[i]+" ");
        }
    }
}
