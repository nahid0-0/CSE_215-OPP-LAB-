import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


//                            Ans : 1
class room{
    int room_number;
    float room_area;
    String room_type;
    boolean Ac_mechine;
    void set_data(int a, float b, String s, boolean p){
        this.room_number = a;
        this.room_area = b;
        this.room_type = s;
        this.Ac_mechine = p;
    }
    void display(){
        System.out.println(room_number);
        System.out.println(room_area);
        System.out.println(room_type);
        System.out.println(Ac_mechine);
    }
}
//                                          ans : 2
class simple_object{
    simple_object(){
        System.out.println("hello simple object is created");
    }
    //                                ans : 3
    class room{
        int room_number;
        float room_area;
        String room_type;
        boolean Ac_mechine;
        void set_data(int a, float b, String s, boolean p){
            this.room_number = a;
            this.room_area = b;
            this.room_type = s;
            this.Ac_mechine = p;
        }
        void display(){
            System.out.println(room_number);
            System.out.println(room_area);
            System.out.println(room_type);
            System.out.println(Ac_mechine);
        }
    }
//                                      ans : 4
class root{
    int a;
    int b;
}
class leaf extends root{
    int c;
    int d;
    leaf(int c){
        super.a = c;
    }
}

//                   ans : 4
class a{
    void f(){
        System.out.println("parents f");
    }
}
class b extends a{
    void f(){
        System.out.println("child's f");
    }
}
class shape{
    void draw(){
        System.out.println("draw");
    }
    void erase(){
        System.out.println("erase");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("draw circle");
    }
    void erase(){
        System.out.println("erase circle");
    }

}
class triangle extends shape{
    void draw(){
        System.out.println("draw triangle");
    }
    void erase(){
        System.out.println("erase triangle");
    }

}
class square extends shape{
    void draw(){
        System.out.println("draw square");
    }
    void erase(){
        System.out.println("erase square");
    }
}
abstract class abstract_class{
    static int a = 9;
}
class child extends  abstract_class{
    child(int a){
        this.a = a;
    }
}
interface A {
    void meth1();
    void meth2();
}
class my_class implements A{
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}
interface  B{
    void meth3();
    void meth4();
}
class decent implements A,B{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}




//                                         ans : 12
public class Main{
    public static void main(String[] args){
        int hue, lightness, saturation;
        int red = 193;
        int green = 255;
        int blue = 183;
        hue =  (60 * (green - blue)) / (green - red) + 120;
        int M = Math.max(green, Math.max(blue, red));
        int m = Math.min(green, Math.min(blue, red));
        lightness = (m+M)/2;
        if(lightness < 128){
            saturation = 255 * (M - m) / (M + m);
        }
        else{
            saturation = 255 * (M - m) / (511 - (M + m));
        }
        System.out.println(hue);
        System.out.println(lightness);
        System.out.println(saturation);

    }
}



//                                           Ans : 13
class recursion{
    int f(int n) {
        if(n == 0){
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return (f(n-1) + f(n-2));
        }
    }
}


//                                          Ans : 14

class point{
    private int x, y;
    public point(){

    }
    point(int x, int y){
        this.x =  x;
        this. y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

}


//                                   Ans : 15
class box{

    private float height, length, breadth;
    box(float a, float b, float c){
        this.length = a;
        this.breadth = b;
        this.height = c;
    }
    float area(int a, int b, int c){
        return 2*a*b + 2*b*c + 2*a*c;
    }
    box(){}
}
class box3d extends box{

    float volume(int a, int b, int c){
        return  a+b+c;
    }

}



//                                         Ans :17
//public class Main{
//
//    public static void main(String[] args){
//        try{
//            int arr_size = 8;
//            if (arr_size < 0) {
//                throw new NegativeArraySizeException();
//            }
//            else{
//                int [] arr = new int[arr_size];
//            }
//
//        }
//        catch(ArithmeticException e){
//            System.out.println("array size can't be negative");
//        }
//        finally{
//            System.out.println("Finally block executed.");
//
//        }
//
//    }
//
//}
//                          ans :18
class exception_with_throws{
    float f(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        else return a/b;

    }
}
//                        ans : 19
class custom_exception extends Exception {
    custom_exception(String Message){
        super(Message);
    }

}


//public class Main{
//    public static void check(int n) throws custom_exception{
//        if(n < 18) throw new custom_exception("not valid");
//        System.out.println("is valid");
//    }
//    public static void main(String[] args){
//        int n = 9;
//       try{
//           check(n);
//
//       }catch(custom_exception e){
//           System.out.println( e.getMessage());
//
//
//        }
//    }
//}


//                      ans : 20
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//public class Main{
//    public static void main(String[] args){
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(8);
//        a.add(7);
//        a.add(6);
//        a.add(4);
//        a.add(3);
//        a.add(1);
//        a.add(2);
//        Collections.sort(a);
//        for(int i  = 0; i < a.size(); i++){
//            System.out.print(a.get(i));
//            System.out.print(" ");
//        }
//        System.out.println();
//    }
//}



































