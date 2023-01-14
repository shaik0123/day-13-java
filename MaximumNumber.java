package day13;

public class MaximumNumber<T extends Comparable<T>> {

    T x, y, z;

    public MaximumNumber(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum() {
       return  MaximumNumber.maximum(x, y, z);

    }
    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
       T max = x;
       if(y.compareTo(max)>0);{
           max = y;
       }
           if(z.compareTo(max)>0){
               max = z;
        }
       return max;
    }
    public static String testMaximum(String x,String y,String z){
        String max = x;
        if(y.compareTo(max)>0);{
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        Integer xInt = 3, yInt = 4, zInt = 5;
        Float xFl = 3.3f, yFl = 4.4f, zFl = 5.5f;
        String xStr = "Best", yStr = "cought", zStr = "Sky";
        MaximumNumber.testMaximum(xStr, yStr, zStr);
//        new MaximumNumber(xInt, yInt, zInt).maximum();
//        new MaximumNumber(xInt, yInt, zInt).maximum();
//        new MaximumNumber(xInt, yInt, zInt).maximum();
    }

}
