import java.util.*;
class BrainTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int option[]=new int[20];
		System.out.println("1. I do not expect to be praised by others.(Choose 1 2 3 4 5)");
		option[0]=sc.nextInt();
		System.out.println("2. I like sitting in the Math class rather than sitting in the Pottery class(Choose 1 2 3 4 5)");
		option[1]=sc.nextInt();
		System.out.println("3. I always show up in/on time.(Choose 1 2 3 4 5)");
		option[2]=sc.nextInt();
		System.out.println("4. I do not care to read to the instructions before I start putting something together, I like learning along the way.(Choose 1 2 3 4 5)");
		option[3]=sc.nextInt();
		System.out.println("5. I am tidy and organized and cannot live in a mess.(Choose 1 2 3 4 5)");
		option[4]=sc.nextInt();
		System.out.println("6. My thinking is random & unstructured..(Choose 1 2 3 4 5)");
		option[5]=sc.nextInt();
		System.out.println("7. I am an effective communicator.(Choose 1 2 3 4 5)");
		option[6]=sc.nextInt();
		System.out.println("8. I can picture things clearly in my head.(Choose 1 2 3 4 5)");
		option[7]=sc.nextInt();
		System.out.println("9. I often come up with new ideas.(Choose 1 2 3 4 5)");
		option[8]=sc.nextInt();
		System.out.println("10. I am not easily disturbed by events.(Choose 1 2 3 4 5)");
		option[9]=sc.nextInt();
		System.out.println("11. I rarely cry while watching sad movies or incidents.(Choose 1 2 3 4 5)");
		option[10]=sc.nextInt();
		System.out.println("12. I am good at laying out a step-by-step plan.(Choose 1 2 3 4 5)");
		option[11]=sc.nextInt();
		System.out.println("I am the happiest when I am creating or expressing myself.(Choose 1 2 3 4 5)");
		option[12]=sc.nextInt();
		System.out.println("14. I make decisions based on facts, not feelings.(Choose 1 2 3 4 5)");
		option[13]=sc.nextInt();
		System.out.println("15. I make a mess of things.(Choose 1 2 3 4 5)");
		option[14]=sc.nextInt();
		System.out.println("16. I get stressed out easily.(Choose 1 2 3 4 5)");
		option[15]=sc.nextInt();
		System.out.println("17. I like fantasy and make believe.(Choose 1 2 3 4 5)");
		option[16]=sc.nextInt();
		System.out.println("18. I prize logic above all else.(Choose 1 2 3 4 5)");
		option[17]=sc.nextInt();
		System.out.println("19. I often forget to put things back in their proper place.(Choose 1 2 3 4 5)");
		option[18]=sc.nextInt();
		System.out.println("20. I keep my feelings controlled.(Choose 1 2 3 4 5)");
		option[19]=sc.nextInt();
		int a=option[0]+option[1]+option[2]+option[4]+option[7]+option[9]+option[10]+option[11]+option[13]+option[17]+option[19];
		int b=option[3]+option[5]+option[6]+option[8]+option[12]+option[14]+option[15]+option[16]+option[18];
		int sum=66-a+b;
		if((sum>=22)&&(sum<=55))
			System.out.println("leftbrained");
		if((sum>=56)&&(sum<=64))
			System.out.println("No clear preference");
		if((sum>=65)&&(sum<=100))
             		System.out.println( "rightbrained");
		else
		     System.out.println("false");	
		
	}
}