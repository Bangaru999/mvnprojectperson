package mavenproject;
import java.util.*;

public class Person implements Comparable<Person>{
	int pid;
	String pname;
	int purchaseAmount;
	int age;
	
	Person(int pid,String pname, int purchaseAmount, int age ){
		this.pid = pid;
		this.pname = pname;
		this.purchaseAmount = purchaseAmount;
		this.age = age;
	}
	
	public void setpurchaseAmount(int pid) {
		this.purchaseAmount=pid;
	}
	public int compareTo(Person st) {
		if (pname==st.pname) {
			return 0;
		}
		else
			if(pname.compareTo(st.pname)<0) {
				return 1;
			}
			else {
				return -1;
			}
	}
}
