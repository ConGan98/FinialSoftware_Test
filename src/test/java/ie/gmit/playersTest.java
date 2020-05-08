package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class playersTest {
    private players myplayers;

    @BeforeEach
    void init(){
        myplayers = new players("Paul", "Pogba", "pPogba@gmail.com", "093 1234567",6,"H54 HD53");
    }

    @Test
    void addEmployee(){
        //default test everything good
        assertEquals("Paul", myplayers.getFirst_name());
        assertEquals("Pogba", myplayers.getSecond_name());
        assertEquals("pPogba@gmail.com", myplayers.getEmail());
        assertEquals("093 1234567", myplayers.getPhone_number());
        assertEquals(6, myplayers.getPlayer_number());
        assertEquals("H54 HD53", myplayers.getAddress());
    }
    @Test
    void emptydataFail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players(" ", "Pogba", "pPogba@gmsil", "093 1234567",6,"H54 HD53"));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void emptydataFail1(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("con", " ", "cks@gmsil", "093 1234567",101,"H54 HD53"));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void emptydataFail2(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("conor ", "Kenny", " ", "093 1234567",101,"H54 HD53"));
        assertEquals("Data is empty",e.getMessage());
    }
    @Test
    void emptydataFail3(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("conor ", "Kenny", "ioijij ", " ",101,"H54 HD53"));
        assertEquals("Data is empty",e.getMessage());
    }



    @Test
    void emptydataFail4(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("con ", "Kenny", "cks@gmsil", "093 1234567",101," "));
        assertEquals("Data is empty",e.getMessage());
    }
    @Test
    void emailFail(){
        //testing empty email
        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Conor", "Kenny", "hghasgh ", "093 1234567",101,"H54 HD53"));
        assertEquals("Invalid email address must have @ ",e.getMessage());
    }
    @Test
    void phoneNumberFail(){
        //testing empty phone number
        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Conor", "Kenny", "conorjKenny@gmail.com", "566 ",101,"H54 HD53"));
        assertEquals("Invalid Phone number length ",e.getMessage());//tets
    }
    @Test
    void PlayerNumberFail(){
        //testing empty EmployeeNumber
        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Conor", "Kenny", "conorjKenny@gmail.com", "093 1234567",0,"H54 HD53"));
        assertEquals("Invalid squad number length",e.getMessage());
    }

    @Test
    void addressFail(){
        //testing empty address
        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Conor", "Kenny", "conorjgannon@gmail.com", "093 1234567",101,"1234"));
        assertEquals("Invalid post code length ",e.getMessage());
    }
}