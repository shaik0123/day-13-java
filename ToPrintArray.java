package day13;

public class ToPrintArray <x,y,z>{
    x[] myArray;
    y[] myArray1;
    z[] myArray2;

    public ToPrintArray(x[] myArray,y[] myArray1, z[] myArray2) {
        this.myArray = myArray;
        this.myArray1 = myArray1;
        this.myArray2 = myArray2;
    }
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        Double[] b ={0.1, 0.2, 0.3};
        Character[] c = {'a', 'b','c'};
        new ToPrintArray<Integer,Double,Character>(a,b,c).print();
    }
    public void print(){
        ToprintArray(myArray);
        ToprintArray(myArray1);
        ToprintArray(myArray2);
    }
    private static<E> void ToprintArray(E[] a) {
        for(E element: a){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
