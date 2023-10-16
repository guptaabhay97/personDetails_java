
/**
 * PersonDetails
 */
import java.util.Scanner;

class Person{
    String firstName;
    String lastName;
    String address;
    private String mobileNo;
    static int count;

    Person(){
        count++;
    }
    static int getCount(){
        return count;
    }

    void setFirstName(String tempName){
        if(tempName == ""){
            System.out.println("Name is Empty");
        }else{
            firstName = tempName;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    void setMobileNo(String tempMobileno){
        if(tempMobileno.length() > 10 || tempMobileno.length() < 9){
            System.out.println("Mobile No. Must Be 10 Digit No");
        }else if(tempMobileno.length() == 10){
            mobileNo = tempMobileno;
        }

    }

    public String getMobileNo() {
        return mobileNo;
    }
    
}

public class PersonDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person per1 = new Person();
        
        System.out.println(Person.getCount());

        System.out.println("Enetr The Frist Name");
        // per1.setFirstName(sc.next());

        String tepmnam = per1.getFirstName();
        // System.out.println(tepmnam);

        System.out.println("Enetr Mobile No.");
        // per1.setMobileNo(sc.next());

        String tempMob = per1.getMobileNo();
        // System.out.println(tempMob);


        Person per2 = new  Person();

        System.out.println(Person.getCount());

        System.out.println("Enetr The Frist Name");
        per1.setFirstName(sc.next());

        String tepmnam2 = per1.getFirstName();
        System.out.println(tepmnam);

        System.out.println("Enetr Mobile No.");
        per1.setMobileNo(sc.next());

        String tempMob2 = per1.getMobileNo();
        System.out.println(tempMob);

        
    }
}