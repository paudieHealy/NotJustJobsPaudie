public class Business extends Member{

    private String companyName;
    private Member member;
    private String provence;
    private String workType;

    public Business(String companyName,String name, String county,
                    String username, String password, int yearOfBirth, String provence, String workType)
    {
        super(name,county,username,password, yearOfBirth);
        this.provence = provence;
        this.workType = workType;
        this.companyName = companyName;
    }

    public String getProvence(){
        return provence;
    }

    public void setProvence(String provence) { this.provence = provence; }

    public String getWorkType(){
        return workType;
    }

    public void setWorkType(String workType) { this.workType = workType; }

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
        return "\n\nCompany Name: " + getCompanyName() + super.toString() +
                "\nProvence: " + getProvence() + "\nWork Type: " + getWorkType();
    }

}
