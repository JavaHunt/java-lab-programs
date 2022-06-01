// Write a JAVA program that implements Runtime polymorphism
// Method Overriding
/* This code is contributed by java_hunt instagram page*/

class Base
{
	int i;
	void print(){
		for(i = 1; i <= 5; i++)
			System.out.println(i);
	}
}

class Derived extends Base
{
	int j;
	void print(){
		for(j = 5; j > 0; --j)
			System.out.println(j);
	}
}

class Exp8_a
{
	public static void main(String args[]){
		Derived obj = new Derived();
		obj.print();
	}
}

/*
Output :

5
4
3
2
1

*/