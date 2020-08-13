//1.Implement the concept of control statement and array
//2.Implement the concept of class,data members,member functions and access specifier.
import java.util.*;
//Class Main
public class Main {
	static String invnName="HUL Inventory System";
	//access specifier is public
	//member function
public static void main(String args[]){
		//Data Members
		//Initialising Array
		int prodId[];
		int items;
		int price[];
		String prodName[];
		int c=1;
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to HUL " + invnName);
		System.out.println("How many products you have in the store?");
		items=st.nextInt();
		prodId=new int[items];
		prodName= new String[items];
		price=new int[items];
		//Using for-loop and if statement as control statement
		for(int i=0;i<items;i++){                                                         
			prodId[i]=c++;
			System.out.println("Enter the name of the item "+(i+1));
			prodName[i]=st.next();
			System.out.println("Enter the price of the "+prodName[i]);
			price[i]=st.nextInt();
			if(price[i]<=0){
				System.out.println("Price cannot be zero or less. Enter the price of the "+prodName[i]+" again");
				price[i]=st.nextInt();
			}
		}
		System.out.println("Product Id "+"Product Name "+ " Price of the Product");
		for(int i=0;i<items;i++){
			System.out.println(prodId[i]+"          "+prodName[i]+"          "+price[i]);
		}
	}
}