package Array;



public class maxAndMinofArray {
    public int[] MaxandMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int num : arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return new int[]{min,max};
    }
}

// public class main {
//  public int[] MaxandMin(int[] arr){
//       int max = Integer.MIN_VALUE;
//       int min = Interger.MAX_VALUE;
//       for (int num : arr){
//            if(num > max){
//                max = num;
//             }
//            if}}}}}





