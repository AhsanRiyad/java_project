
package basic;


public class UserBasic{
	
	String userName;
	String userFullName;
	String userPassword;
	String userEmail;
	int userMobile;

	public UserBasic()
	{

	}

	public void setUserDetails(String userName, String userFullName, String userEmail, String userPassword)
	{
		this.userName = userName;
		this.userFullName = userFullName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}


	public String getId()
	{
		return userName;
	}

	public String getName()
	{
		return userFullName;
	}


	public String getEmail()
	{
		return userEmail;
	}

}