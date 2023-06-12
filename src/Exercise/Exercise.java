package Exercise;

import org.omg.CORBA.ARG_IN;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int []arr1 = {4,46,2,64,42};
        int []arr2 ;
//        System.arraycopy(arr1,0,arr2,0,5);
//
         arr2 =  Arrays.copyOf(arr1,7);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
