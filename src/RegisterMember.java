import java.util.*;
import javax.swing.*;

public class RegisterMember {

    public RegisterMember()
    {
        Set<Member> member = new TreeSet<Member>();

        while(JOptionPane.showConfirmDialog(null,"Add a member type ?") == JOptionPane.YES_OPTION)
        {
            String answer = JOptionPane.showInputDialog("Member (M) or Business(B)");
            if(answer.charAt(0)=='M')
            {
                Member mem = addMember();
                member.add(mem);
            }
            else if(answer.charAt(0)=='B')
            {
                Business bus = addBusiness();
                member.add(bus);
            }
        }

    }

    public static void main(String [] args)
    {
        RegisterMember regMem = new RegisterMember();
    }

    public  Member addMember()
    {
        String name;
        String county;
        String username;
        String password;
        name = JOptionPane.showInputDialog("Please enter your name: ");
        county = JOptionPane.showInputDialog("Please enter your county: ");
        username = JOptionPane.showInputDialog("Please enter your username: ");
        password = JOptionPane.showInputDialog("Please enter your password: ");
        Member member = new Member(name,county,username,password);
        return member;
    }

    public Business addBusiness()
    {
        String companyName;
        String name;
        String county;
        String username;
        String password;
        companyName = JOptionPane.showInputDialog("Please enter your company name: ");
        name = JOptionPane.showInputDialog("Please enter your name: ");
        county = JOptionPane.showInputDialog("Please enter your county: ");
        username = JOptionPane.showInputDialog("Please enter your username: ");
        password = JOptionPane.showInputDialog("Please enter your password: ");
        Business business = new Business(companyName,name,county,username,password);
        return business;

    }
}

