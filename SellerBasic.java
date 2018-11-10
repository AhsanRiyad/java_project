
package basic;


public class SellerBasic{
	
	String sellerName;
	String sellerFullName;
	String sellerPassword;
	String sellerEmail;
	int sellerMobile;

	public SellerBasic()
	{

	}

	public void setSellerDetails(String sellerName, String sellerFullName, String sellerEmail, String sellerPassword)
	{
		this.sellerName = sellerName;
		this.sellerFullName = sellerFullName;
		this.sellerEmail = sellerEmail;
		this.sellerPassword = sellerPassword;
	}


	public String getId()
	{
		return sellerName;
	}

	public String getName()
	{
		return sellerFullName;
	}


	public String getEmail()
	{
		return sellerEmail;
	}

}