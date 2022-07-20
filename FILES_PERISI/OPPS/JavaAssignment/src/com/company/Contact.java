import com.company.Details1Compulsary;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String Anniversary;
    private String Adress;
    private String Area;
    private String City;
    private String pinCode;
    private String country;
    private String TelePhone;
    private String email;
    private String website;

    public Contact(String firstName, String middleName, String lastName, String dateOfBirth, String gender, String anniversary, String adress, String area, String city, String pinCode, String country, String telePhone, String email, String website) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        Anniversary = anniversary;
        Adress = adress;
        Area = area;
        City = city;
        this.pinCode = pinCode;
        this.country = country;
        TelePhone = telePhone;
        this.email = email;
        this.website = website;
    }
    public void Contact(){
        if(this.firstName==null
            &&this.lastName==null
            &&this.dateOfBirth==null
            &&this.email==null){
            throw new Details1Compulsary("firstName,lastName,dateOfBirth,email are compulsary");
        }else{
            System.out.println("Details 1 are correct");
        }
//        if(this.email.contains()){
//
//        }else{
//
//        }
//        if(){
//
//        }else{
//
//        }
    }
}
