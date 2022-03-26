import java.util.Scanner;
class AreaShape{

public void circle()
{
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter the radius");
  float r = s1.nextFloat();
  float pi=3.14f;
  float c = pi*r*r;
  System.out.println("Area is"+c);
}

public void square()
{
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter the side");
  float a = s1.nextFloat(); 
  float c = a*a;
  System.out.println("Area is"+c);
}


public static void main(String args[])
{
AreaShape a1 = new AreaShape();
System.out.println("Enter your choice:");
System.out.println("A.Circle");
System.out.println("B.Square");
Scanner s1 = new Scanner(System.in);
char r = s1.next().charAt(0);
switch(r)
{
case 'A':a1.circle();
       break;
case 'B':a1.square();
       break;
default:System.out.println("Invalid case");
}

}

}
