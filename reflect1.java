//program to count all methods of object class as javap java.lang.Object does not dispaly private method (registerNatuves)
import java.lang.reflect.*;
class reflect1
{
    public static void main(String ar[]) throws Exception
    {
        Class c=Class.forName("java.lang.Object");
        Method m[]=c.getDeclaredMethods();
        for(Method m2:m)
        {
            System.out.println(m2); 
        }
       
    }
}