//program to count no of variables in a user-define class 
import java.lang.reflect.*;
class A {
    int x;
    int y;
    int z;
}
class reflect2
{
    public static void main(String ar[]) throws Exception
    {
        Class c=Class.forName("java.lang.Object");
        Field m[]=c.getDeclaredField();
        for(Field m2:m)
        {
            System.out.println(m2); 
        }
       
    }
}