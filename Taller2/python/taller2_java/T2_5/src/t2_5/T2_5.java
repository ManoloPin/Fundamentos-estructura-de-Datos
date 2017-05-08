package t2_5;
/**
 *
 * @author manuel
 */
public class T2_5 {

    public static void main(String[] args) {
        int A[] = {10, 4, 1, 6, 2};
        int B[] = new int[A.length];
        int producto = 1;
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i]+"\t");
        }
        System.err.println("");
        for (int i =0; i < A.length; i++) {
                producto *=A[i];        
        }
        for (int i = 0; i < A.length; i++) {
            B[i] = producto/A[i];
        }
        System.out.println("");
        System.out.println("array B : ");
        for (int i = 0; i < A.length; i++) {
            System.out.printf(B[i]+"\t");
        }
             
    }
}
