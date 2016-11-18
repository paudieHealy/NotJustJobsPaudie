public class Register {

    private String name;
    private String county;
    private String username;
    private String password;

    public Register()
        {
            this.name = "Joe Bloggs";
            this.county = "Dublin";
            this.username = "username";
            this.password = "password";
        }

    public Register(String name, String county, String username, String password)
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

    public String county()
        {
            return county;
        }

    public String getUsername()
        {
            return username;
        }

    public String getPassword()
        {
            return password;
        }

    public void setName(String name)
        {
            this.name = name;
        }

    public void setCounty(String county)
        {
            this.county = county;
        }

    public void setUsername(String username)
        {
            this.username = username;
        }

    public void setPassword(String password)
        {
            this.password = password;
        }

    public String toString()
        {
            return "\nName: " + this.name + "\nCounty: " + this.username +
                    "\nUsername: " + this.username + "\nPassword: " + this.password;
        }




}
