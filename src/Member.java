public class Member {

    private int age;
    private Register register;

    public Member(int age, String name, String county,
                  String username, String password)
        {
            setAge(age);
            setRegister(new Register(name,county,username,password));
        }

    public int getAge()
        {
            return age;
        }

    public void setAge(int age)
        {
            this.age = age;
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
            return getRegister() + "\nMember's age: " + getAge();
        }

}