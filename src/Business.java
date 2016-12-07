public class Business extends Member{

    private String companyName;
    private Member member;
    private double companyRate;
    private Provence provence;
    private WorkType work;

    public Business(String companyName,String name, String county,
                    String username, String password, int yearOfBirth,Provence provence,WorkType work)
    {
        super(name,county,username,password, yearOfBirth);
        this.provence = provence;
        this.work = work;
        this.companyName = companyName;
    }

    public Provence getProvence(){
        return provence;
    }

    public WorkType getWorkType(){
        return work;
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

}
