public class Business extends Member{

    private String companyName;
    private Member member;
    private double companyRate;

    public Business(String companyName,String name, String county,
                    String username, String password)
    {
        super(name,county,username,password);
        setCompanyName(companyName);
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public Member getMember()
    {
        return member;
    }

    public void setMember(Member member)
    {
        this.member = member;
    }

    public String toString()
    {
        return "\nCompany Name: " + getCompanyName() + member.toString();
    }

}
