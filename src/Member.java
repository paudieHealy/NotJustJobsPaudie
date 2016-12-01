public class Member {

    private String name;
    private String county;
    private String username;
    private String password;
    private int yearOfBirth;

    public Member()
    {
        this.name = "Joe Bloggs";
        this.county = "Dublin";
        this.username = "username";
        this.password = "password";
        this.yearOfBirth = 2000;
    }

    public Member(String name, String county,
                  String username, String password, int yearOfBirth)
        {
            setName(name);
            setCounty(county);
            setUsername(username);
            setPassword(password);
            setYearOfBirth(yearOfBirth);

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

    public int getYearOfBirth() { return yearOfBirth; }

    public void setYearOfBirth(int yearOfBirth) {this.yearOfBirth = yearOfBirth; }



    public String toString()
        {
            return "\n\nName: " + getName() + "\nCounty: " + getCounty() +
                    "\nUsernaem: " + getUsername() + "\nPassword: " + getPassword() +
                    "\nYear: " + getYearOfBirth();
        }

}