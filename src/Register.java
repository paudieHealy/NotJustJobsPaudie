public class Register {

    private String name;
    private String county;
    private int age;
    private String username;
    private String password;

    public Register()
        {
            this.name = "Joe Bloggs";
            this.county = "Dublin";
            this.age = 16;
            this.username = "username";
            this.password = "password";
        }

    public Register(String name,String county, int age, String username, String password)
        {
            this.name = name;
            this.county = county;
            this.age = age;
            this.username = username;
            this.password = password;
        }

    public String getName()
        {
            return name;
        }

    public String county()
        {
            return county;
        }

    public int getAge()
        {
            return age;
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

    public void setAge(int age)
        {
            this.age = age;
        }

    public void setUsername(String username)
        {
            this.username = username;
        }

    public void setPassword(String password)
        {
            this.password = password;
        }




}
