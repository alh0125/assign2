public class Finder {
    public java.lang.Integer findMax(int[] intArray){
        if(intArray.length == 0 || intArray == null) {
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
}
