package day13;

public class MaxInt {
    public static String maxInteger(Integer a, Integer b, Integer c) {
        // TODO Auto-generated method stub
        String a1=Integer.toString(a);
        String a2=Integer.toString(b);
        String a3=Integer.toString(c);
        String max=a1;
        if(a2.compareTo(max)>0) {
            max=a2;
        }
        if(a3.compareTo(max)>0) {
            max=a3;
        }
        return max;
    }
    public static void main(String[] args) {
        Integer a=10,b=20,c=30;
        System.out.println(maxInteger(a,b,c));

    }
}