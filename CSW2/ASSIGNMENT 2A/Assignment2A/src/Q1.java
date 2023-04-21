import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.a)
				Scanner sc = new Scanner(System.in);
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				System.out.println(arr);
				
				//1.b)
				System.out.println("Enter value: ");
				int a = sc.nextInt();
				arr.remove(a);
				System.out.println(arr);
				
				//1.c)
				if (arr.size() == 0) {
					System.out.println("The array is empty");
				}
				else {
					System.out.println("The array is not empty");
			
				}
		  }
	}
		

	


