package ie.gmit;



public class employees {
    private String first_name;
    private String second_name;
    private String email;
    private String phone_number;
    private int employee_number;
    private String address;

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//


    public employees(String first_name, String second_name, String email, String phone_number, int employee_number, String address) {

        if(first_name == " " ||  second_name == " " || email == " " || phone_number == " " || address == " "){
            throw new IllegalArgumentException("Data is empty");
        }
        else {
            setFirst_name(first_name);
            setSecond_name(second_name);
            setEmail(email);
            setPhone_number(phone_number);
            setEmployee_number(employee_number);
            setAddress(address);
        }
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if(email.contains("@")){
            this.email = email;
        }
        else{
            throw new IllegalArgumentException("Invalid email address must have @ ");
        }
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {

        if(phone_number.length() >= 10){
            this.phone_number = phone_number;
        }
        else{
            throw new IllegalArgumentException("Invalid Phone number length ");
        }

    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(int employee_number) {

        if(employee_number >= 100){
            this.employee_number = employee_number;
        }
        else{
            throw new IllegalArgumentException("Invalid number length ");
        }
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        if(address.length() >= 7){
            this.address = address;
        }else{
            throw new IllegalArgumentException("Invalid post code length ");
        }
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
}
