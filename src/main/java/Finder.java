public class Finder {
    public java.lang.Integer findMax(int[] intArray){
        if(intArray == null || intArray.length == 0 ) {
        return null;
        }
        int max = intArray[0];
        for(int i = 1; i < intArray.length;i++) {
            if(max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

    public java.lang.Integer findMin(int[] intArray){
        if(intArray == null || intArray.length == 0) {
            return null;
        }
        int min = intArray[0];
        for(int i = 1; i < intArray.length;i++) {
            if(min < intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
}
