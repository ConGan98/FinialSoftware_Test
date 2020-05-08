package ie.gmit;



public class players {
    private String first_name;
    private String second_name;
    private String email;
    private String phone_number;
    private int player_number;
    private String address;

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//


    public players(String first_name, String second_name, String email, String phone_number, int player_number, String address) {

        if(first_name == " " ||  second_name == " " || email == " " || phone_number == " " || address == " "){
            throw new IllegalArgumentException("Data is empty");
        }
        else {
            setFirst_name(first_name);
            setSecond_name(second_name);
            setEmail(email);
            setPhone_number(phone_number);
            setPlayer_number(player_number);
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
    public int getPlayer_number() {
        return player_number;
    }

    public void setPlayer_number(int player_number) {

        if(player_number >= 99){
            this.player_number = player_number;
        }
        else{
            throw new IllegalArgumentException("Invalid squad number");
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
