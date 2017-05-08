package t2_2;
/**
 *
 * @author manuel
 */
public class T2_2 {

    public static void main(String[] args) {
        int A[] = {5,2,2,4,3,5,4,7,3};
        int NRepetido = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i]+"\t");
        }
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[i] != A[j]){
                    NRepetido = A[i];
                }
            }
        }
        System.out.println("el numero no repetido es: "+NRepetido);
    }

}
