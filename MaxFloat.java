package day13;

public class MaxFloat {
    public static String maxFloat(Float f1,Float f2,Float f3) {
        String f1s=Float.toString(f1);
        String f2s=Float.toString(f2);
        String f3s=Float.toString(f3);
        String max=f1s;

        if(f2s.compareTo(max)>0) {
            max=f2s;
        }
        if(f3s.compareTo(max)>0) {
            max=f3s;
        }
        return max;
    }
    public static void main(String[] args) {
        Float f1=12.3f,f2=23.5f,f3=34.5f;
        System.out.println(maxFloat(f1,f2,f3));
    }
}