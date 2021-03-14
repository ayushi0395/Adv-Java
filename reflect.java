//program to count all methods of object class as
import java.lang.reflect.*;
class reflect
{
    public static void main(String ar[]) throws Exception
    {
        Class c=Class.forName("java.lang.Object");
        Method m[]=c.getDeclaredMethods();
        int count;
        for(Method m2:m)
        {
            count++;
        }
        System.out.println(count);
    }
}