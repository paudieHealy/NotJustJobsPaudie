/**
 * Created by paudie on 17/11/2016.
 */
public class Business {

    private String companyName;
    private Register register;
    private double companyRate;

    public Business(String companyName,String name, String county,
                    String username, String password)
        {
            setCompanyName(companyName);
            setRegister(new Register(name,county,username,password));
        }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public Register getRegister()
    {
        return register;
    }

    public void setRegister(Register register)
    {
        this.register = register;
    }

    public String toString()
        {
            return "\nCompany Name: " + getCompanyName() + register.toString();
        }

}
