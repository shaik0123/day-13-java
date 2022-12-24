package day13;

public class MaxString {
    public static String maxString(String s1,String s2,String s3) {
        String max=s1;

        if(s2.compareTo(max)>0) {
            max=s2;
        }
        if(s3.compareTo(max)>0) {
            max=s3;
        }
        return max;
    }
    public static void main(String[] args) {
        String s1="bat",s2="same",s3="bot";
        System.out.println(maxString(s1,s2,s3));

    }
}


