import java.util.*;
import javax.swing.*;

public class RegisterMember {

    public RegisterMember()

    {
        List<Member> member = new ArrayList<Member>();

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
            else
            {
                JOptionPane.showConfirmDialog(null,"Please enter M or B");
            }
        }

        String message = "";
        for(Member m:member)
            {
                message+=m.toString();
            }
        JOptionPane.showMessageDialog(null,"New members to the system: \n" + message);

        searchMembers(member);
    }

    private void searchMembers(List<Member> member)
    {
        List<Member> userCountyCheck = new ArrayList<>();
        for(Member m:member)
        {
            if(m.getCounty().equals("Kerry") && m.getYearOfBirth() < 1998)
            {
                userCountyCheck.add(m);
            }
        }
        String message="";
        Iterator<Member> it = userCountyCheck.iterator();

        while(it.hasNext())
        {
            message+=it.next().toString();
        }
        JOptionPane.showMessageDialog(null,"Members in Kerry older than 18\n "+ message);
    }

    public  Member addMember()
    {
        String name;
        String county;
        String username;
        String password;
        int yearOfBirth;
        name = JOptionPane.showInputDialog("Please enter your name: ");
            if(name.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    name = JOptionPane.showInputDialog("Please enter your name: ");
                }
        county = JOptionPane.showInputDialog("Please enter your county: ");
            if(county.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    county = JOptionPane.showInputDialog("Please enter your county: ");
                }
        username = JOptionPane.showInputDialog("Please enter your username: ");
            if(username.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    username = JOptionPane.showInputDialog("Please enter your username: ");
                }
        password = JOptionPane.showInputDialog("Please enter your password: ");
            if(password.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    password = JOptionPane.showInputDialog("Please enter your password: ");
                }
        yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Please enter year of birth: "));
            if(password.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    Integer.parseInt(JOptionPane.showInputDialog("Please enter year formed: "));
                }
        Member member = new Member(name,county,username,password, yearOfBirth);
        return member;
    }

    public Business addBusiness()
    {
        String companyName;
        String name;
        String county;
        String username;
        String password;
        int yearOfBirth;
        String provence;
        String workType;

        companyName = JOptionPane.showInputDialog("Please enter your company name: ");
            if(companyName.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    companyName = JOptionPane.showInputDialog("Please enter your company name: ");
                }
        name = JOptionPane.showInputDialog("Please enter your name: ");
            if(name.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    name = JOptionPane.showInputDialog("Please enter your name: ");
                }
        county = JOptionPane.showInputDialog("Please enter your county: ");
            if(county.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    county = JOptionPane.showInputDialog("Please enter your county: ");
                }
        username = JOptionPane.showInputDialog("Please enter your username: ");
            if(username.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    username = JOptionPane.showInputDialog("Please enter your username: ");
                }
        password = JOptionPane.showInputDialog("Please enter your password: ");
            if(password.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    password = JOptionPane.showInputDialog("Please enter your password: ");
                }
        yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Please enter year formed: "));
            if(password.equals(""))
                {
                    JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
                    Integer.parseInt(JOptionPane.showInputDialog("Please enter year formed: "));
                }
        provence = JOptionPane.showInputDialog("Please enter your provence: ");
        if(provence.equals(""))
        {
            JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
            provence = JOptionPane.showInputDialog("Please enter your provence: ");
        }
        workType = JOptionPane.showInputDialog("Please enter the workType: ");
        if(workType.equals(""))
        {
            JOptionPane.showConfirmDialog(null,"Please enter valid information!!");
            workType = JOptionPane.showInputDialog("Please enter the workType: ");
        }

        Business business = new Business(companyName,name,county,username,password,yearOfBirth,provence,workType);
        return business;

    }



    public static void main(String [] args)
    {
        RegisterMember regMem = new RegisterMember();
    }
}

