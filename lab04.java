public class lab04 {
    private static final int max = 0;

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        @SuppressWarnings("unused")
        int max;
        maxFind(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static void maxFind(int[] arr) {
     for (int i = 0; i < arr.length; i++) {
        if (i < max) {
            System.out.println("this is the maximum number" + max);
        }
        else{
            System.out.println("try again");
        }
     }
    }
}
