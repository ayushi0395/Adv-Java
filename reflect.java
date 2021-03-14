//program to diaplay all methods of object class as, private method deos not display in javap java.lang.Object;
import java.lang.reflect.*;
class reflect
{
    public static void main(String ar[]) throws Exception
    {
        Class c=Class.forName("java.lang.Object");
        Method m[]=c.getDeclaredMethods();
        int count=0;
        for(Method m2:m)
        {
            count++;
        }
        System.out.println(count);
    }
}