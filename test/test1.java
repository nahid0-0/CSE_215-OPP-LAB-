//*Create an abstract class 'Parent' with a method 'message'.
// It has two subclasses each having a method with the same name 'message' that prints "This is first subclass"
// and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
abstract class Calculate
{
    abstract int add(int a, int b);
}
class strng{
      int f;

      String added(String a, String b){
        return  a+b;
    }
     int add(int a, int b){return  a+b;}

}
public class Main
{
    public static void main(String[] args)
    {
        boolean ans = new strng(){boolean flag(int a, int b){return a>b;}}.flag(5,9);
        System.out.println(ans);
    }
}

