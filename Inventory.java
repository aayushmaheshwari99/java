import java.util.*;
public class Inventory {											//Class Inventory
	static int productId;
	static String productName;
	static int priceList;
		
	static class name{												//static class
													
			static String invtName;									//static variable
			
			static{													//static block
				invtName="HUL Inventory System";
			}
			static String display(){								//static function
				return invtName;
				
			}
		}	

	public Inventory(int productId) { 								// constructor  
		Inventory.productId = productId;

	}

	public Inventory(int productId, String productName, int priceList) { // constructor overloading
		Inventory.productId = productId;
		Inventory.productName = productName;
		Inventory.priceList = priceList;
	}

	public void search(int productId){									//function overloading
		if(productId>=01 && productId<=10)
			System.out.println("Products ranging from 01 to 10 comes under Food category");
		else if(productId>=11 && productId<=20)
			System.out.println("Products ranging from 11 to 20 comes under Beverages category");
		else if(productId>=21 && productId<=30)
			System.out.println("Products ranging from 21 to 30 comes under Cosmetics category");
	}

		
	public void search(){												//function overloading
		if(priceList<=100)
			System.out.println(productName+ "comes under Cheap products, whose price is:"+priceList);
		else if(priceList>100 && priceList<=500)
			System.out.println(productName+ "comes under Affordable products, whose price is:"+priceList);
		else
			System.out.println(productName+ "comes under Expensive products, whose price is:"+priceList);
	}

	
	//Access Specifier
	public static void main(String args[])
	{

		//Data Members
		//Initializing Array
		int prodId[];
		int items;
		int price[];
		String prodName[];
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to " +Inventory.name.display());						//calling the static class
		System.out.println("How many products you have in the store?");
		items=st.nextInt();
		prodId=new int[items];
		prodName= new String[items];
		price=new int[items];
		//Using for-loop and if statement as control statement
		for(int i=0;i<items;i++){
			System.out.println("Enter the ProductID");                                                       
			prodId[i]=st.nextInt();
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
			Inventory inv=new Inventory(prodId[i],prodName[i],price[i]);		//calling the constructor
			inv.search();														//Calling function
			Inventory inv1=new Inventory(prodId[i]);							//calling the constructor
			inv1.search(prodId[i]);												//Calling function
		
		
	}
	st.close();
	}
}


