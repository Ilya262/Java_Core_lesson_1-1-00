package lesson1;

public class lesson1 {




public static void main(String[] args) {
	
	//завдання 1
	byte a=1;
	short b=1;
	int c=1;
	long d=1;
	char e='q';
	double t=2.4;
	float r=3.4e+38f;
	boolean y=true;
	boolean h=false;
	//завдання 2
	Boolean q=y;
	Boolean s=h;
	System.out.println("Byte = "+ Byte.MAX_VALUE);
	System.out.println("Byte = "+ Byte.MIN_VALUE);
	System.out.println("Short = "+ Short.MAX_VALUE);
	System.out.println("Short = "+ Short.MIN_VALUE);
	System.out.println("Integer = "+ Integer.MAX_VALUE);
	System.out.println("Integer = "+ Integer.MIN_VALUE);
	System.out.println("Long = "+ Long.MAX_VALUE);
	System.out.println("Long= "+ Long.MIN_VALUE);
	System.out.println("Double = "+ Double.MAX_VALUE);
	System.out.println("Double = "+ Double.MIN_VALUE);
	System.out.println("Float = "+ Float.MAX_VALUE);
	System.out.println("Float = "+ Float.MIN_VALUE);
	System.out.println("Character = "+ (int)Character.MAX_VALUE+0);
	System.out.println("Character = "+ (int)Character.MIN_VALUE+0);
	System.out.println("Boolean  = "+ y);
	System.out.println("Boolean  = "+ s);
	
	
	//завдання 3
	
	
	int [] arr=new int [100];
	
	for( int i = 0; i<arr.length ;i++) {
		arr [i] = i;}
for( int i = 0; i<arr.length ;i++) {
	 System.out.println(arr[i]);
}
int max = arr[0];
int min = arr[0];

for(int i=0;i<arr.length;i++) {
	if(max<arr[i]) {
		max=arr[i];
		
	}
	if(min>arr[i]) {
		min=arr[i];
		
	}
	
}
System.out.println("maximum = "+max);
System.out.println("maximum = "+min);

}
}
