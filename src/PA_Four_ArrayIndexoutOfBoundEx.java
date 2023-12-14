public class PA_Four_ArrayIndexoutOfBoundEx {
    public static void main(String[] args) {
        int[] arrs = {13, 5, 7, 68, 2};
        //Printing First Element
        System.out.println(arrs[arrs.length - arrs.length]);
        //Printing last Element
        System.out.println(arrs[arrs.length - 1]);
        //Printing Exception (ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5)
        try {
            System.out.println(arrs[arrs.length]);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
