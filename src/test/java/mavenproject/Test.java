package mavenproject;
import java.util.*;

public class Test {
	public static void main(String [] args) {
		ArrayList<Person>a1=new ArrayList<Person>();
		a1.add(new Person(1,"indra", 5000, 60));
		a1.add(new Person(2,"venky", 10000, 40));
		a1.add(new Person(3,"pruthvi", 7000, 50));
		a1.add(new Person(4,"shiva", 5900, 45));
		a1.add(new Person(5,"pandu", 8000, 47));
		a1.add(new Person(6,"ajay", 12000, 76));
		a1.add(new Person(7,"chinna", 4500, 88));
		a1.add(new Person(8,"bheem", 6700, 78));
		a1.add(new Person(9,"ram", 2600, 30));
		a1.add(new Person(10,"chanti", 7750, 68));
		int len=a1.size();
		Scanner sc= new Scanner(System.in);
		String whilechoice="go";
		while(whilechoice=="go") {
			String avail="False";
			System.out.println("Enter your Choice");
			System.out.println("1--Person data in Ascending Order");
			System.out.println("2--Enter id to update purchaseAmount of person");
			System.out.println("");
			
			int a = sc.nextInt();
			switch(a) {
			
			case 1:
				System.out.println("");
				System.out.println("Person data in Ascending Order");
				System.out.println("Person pid, pname, purchaseAmount, age");
				Collections.sort(a1);
				for(Person st:a1) {
					System.out.println(st.pid+ " " + st.pname + " " + st.purchaseAmount  + " " + st.age);
				}
				break;
				
			case 2:
				System.out.println("");
				System.out.println("Enter Person id to update purchaseAmount");
				int b = sc.nextInt();
				System.out.println("Enter the new purchaseAmount");
				int c = sc.nextInt();
				for(int i=1;i<len;i++) {
					if(a1.get(i).pid==b) {
						a1.get(i).setpurchaseAmount(c);
						avail="True";
						
				System.out.println("Updated purchaseAmount..." + " " + "id: " + a1.get(i).pid + " " +  "Pname : " + a1.get(i).pname+ " " + "Updated Amount : " +a1.get(i).purchaseAmount + " " );
					}
				}
				if("False".equals(avail)) {
					System.out.println("Invalid Person Id");
				}
				break;
			}
		}
	}
}
