//1.Implement the concept of control statements and array in the list
//2.Implement the concept of class,data members,member functions and access specifier.
import java.util.*;
//Class Product
public class Inventory {
	static String invnName="HUL Inventory System";
	int productId;
	String productName;
	int priceList;
	//Member functions
	public Inventory(int productId, String productName, int priceList){
		this.productId=productId;
		this.productName=productName;
		this.priceList=priceList;
	}
	
	public void getProduct(){
		if(priceList<=100)
			System.out.println("The price of the "+productName+ " is:"+priceList);
		else if(priceList>100 && priceList<=500)
			System.out.println("The price of the "+productName+ " is:"+priceList);
		else
			System.out.println("The price of the "+productName+ " is:"+priceList);
	}
	
	//Access Specifier
	public static void main(String args[]){
		//Data Members
		//Initialising Array
		int prodId[];
		int items;
		int price[];
		String prodName[];
		int c=1;
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to " + invnName);
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

		System.out.println("Product Id"+"Product Name"+"Price of the Product");
		for(int i=0;i<items;i++){
			System.out.println(prodId[i]+"            "+prodName[i]+"            "+price[i]);
		}
		
		for(int i=0;i<items;i++){
			Inventory inven=new Inventory(prodId[i],prodName[i],price[i]);							//Array of objects
			inven.getProduct();																	//Calling function
		}
		
	}
}
