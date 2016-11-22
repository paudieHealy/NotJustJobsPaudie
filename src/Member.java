public class Member {

    private String name;
    private String county;
    private String username;
    private String password;

    public Member()
    {
        this.name = "Joe Bloggs";
        this.county = "Dublin";
        this.username = "username";
        this.password = "password";
    }

    public Member(String name, String county,
                  String username, String password)
        {
            setName(name);
            setCounty(county);
            setUsername(username);
            setPassword(password);

        }

    public String getName()
        {
            return name;
        }

    public void setName(String name)
        {
            this.name = name;
        }

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }



    public String toString()
        {
            return "\nName: " + getName() + "\nCounty: " + getCounty() +
                    "\nUsernaem: " + getUsername() + "Password: " + getPassword();
        }

}