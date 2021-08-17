package demo1;

public class Sales1 {

	public void display ()
	{
	int[] arr= {11,23,45,12,10};
	int sum=0;
	for(int num:arr)
	{
		sum+=num;
		System.out.println(num);
	}
	System.out.println("summation:"+sum);

}
	public void print()
	{
		System.out.println("Print all numbers");
		display();
	}
}
