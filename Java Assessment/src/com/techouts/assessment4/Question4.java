/*hashCode(), equals(), toString() and .equals(), .parseInt()=>Perform programs*/

package com.techouts.assessment4;
public class Question4 {
	String name;
	int i;
	Question4(String name)
	{
		this.name=name;
	}
	Question4(int i)
	{
		this.i=i;
	}
	public String toString() //overriding toString() of object class
	{
		return name;
	}
	public int hashCode()  //overriding hashCode() of object class
	{
		return i;
	}
	public static void main(String[] args) {

	
		Question4 obj=new Question4("Keerthana");
		Question4 obj1=new Question4("Keerthana");
		Question4 obj2=obj;
		//1.toString()
		System.out.println("Ovverrided toString(): "+obj);
		//2.equals()
		System.out.println("Equals(): "+ obj.equals(obj1)); //same content but reference different
		System.out.println(obj.equals(obj2));//same content & reference
		//3.hashCode()
		Question4 i1=new Question4(1);
		Question4 i2=new Question4(2);
		System.out.println("overrided HashCode(): "+i1.hashCode());
		System.out.println(i2.hashCode());
		//4.parseInt()
		String s="123";
		int x=Integer.parseInt(s);
		System.out.println("parseInt() "+s);
	}

}
