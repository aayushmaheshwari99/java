//base class
abstract class HULFoodDept                                                  //abstract class
{ 
    protected String brandName;
    boolean isProductExists;

    // HULFoodDept class parameterized constructor
    public HULFoodDept(String brandName) {
        this.brandName = brandName;                                         //using this keyword to give reference 
        this.isProductExists=false;
    }

    public final String getbrandName() {                                      //using final keyword
        return brandName;
    }

    abstract boolean getOwnership();

}

// derived class one
class Coffee extends HULFoodDept

{

    public Coffee(String brandName) {
        // calling HULFoodDept class constructor
        super(brandName);
    }


    public boolean getOwnership() {
        if (getbrandName() == "Nestle") {
            isProductExists=true;
        }
        return isProductExists;
    }
	
} 

//derived class two 
class Icecream extends HULFoodDept 
{ 

    public Icecream(String brandName) {
        
        super(brandName);
    }

    @Override
    public boolean getOwnership() {
        if (getbrandName() == "Amul" || getbrandName()=="Kwality") {
            isProductExists=true;
        }
        return isProductExists;
    }
	
} 

// Driver class 
public class HUL
{ 
	public static void main(String[] args) 
    {  
        String name="HULFoodDepartMent";                                            //String class
        System.out.println(name);
		// creating Coffee object 
		HULFoodDept s1 = new Coffee("Nestle"); 
		
		// creating IceCream object 
		HULFoodDept s2 = new Icecream("Amul"); 
        
        StringBuffer s = new StringBuffer("Coffee");                                //StringBuffer class
        s.append(" is a part of ");
        s.append(s1.getbrandName());
        s.append("?: ");
        s.append(s1.getOwnership());
		System.out.println(s);
        
        
        StringBuffer st = new StringBuffer("IceCream"); 
        st.append(" is a part of ");
        st.append(s2.getbrandName());
        st.append("?: ");
        st.append(s2.getOwnership());
		System.out.println(st);
		 
		
	} 
} 
