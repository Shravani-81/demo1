package demo1;

public class Sales1 {

	public void display ()
	{
	int sum=0;
	int[] arr= {11,23,45,12,10};
	
	for(int i=0;i<arr.length;i++)
	{
	
		 sum+=arr[i];
		
		System.out.println(arr[i]);
	}
	
	System.out.println("Array Size:"+arr.length);
	System.out.println("Summatio:"+sum);

}
	public void print()
	{
		System.out.println("Print all numbers");
		for(int i=0;i<100;i++)
			System.out.println("Print i"+ i);
		display();
	}
}
