 class B
 {
     int i ;
     B (int i)
     {
     	this.i=i;
     }
 }
 class A implements Cloneable
 {
       B b ;
       int j=20;
       int k=30;
       A(B b,int j,int k)
       {
       	this.b=b;
       	this.j=j;
       	this.k=k;
       }
       void show()
       {
       	System.out.println("i="+b.i);
       	System.out.println("j="+j);
       	System.out.println("k="+k);
       }
       public Object clone() throws CloneNotSupportedException
       {
       	B b2=new B(b.i);
       	 A a3=new A(b2,j,k);
       	 return a3;
       }
 }
 class DeepClone 
 {
 public static void main(String args[])throws CloneNotSupportedException
 {
   B b =new B(10);
   A a1 = new A (b,20,30);
      A a2=(A)a1.clone();
      a1.show();
      a2.show();
      	System.out.println("......");
      	a2.b.i=111;
      	a2.j=222;
      	a1.show();
      	a2.show();
 }
 }