package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class employeesTest {
    private employees myemployees;

    @BeforeEach
    void init(){
        myemployees = new employees("Conor", "Gannon", "conorjgannon@gmail.com", "093 1234567",101,"H54 HD53");
    }

    @Test
    void addEmployee(){
        //default test everything good
        assertEquals("Conor",myemployees.getFirst_name());
        assertEquals("Gannon",myemployees.getSecond_name());
        assertEquals("conorjgannon@gmail.com",myemployees.getEmail());
        assertEquals("093 1234567",myemployees.getPhone_number());
        assertEquals(101,myemployees.getEmployee_number());
        assertEquals("H54 HD53",myemployees.getAddress());
    }
    @Test
    void emptydataFail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployees = new employees(" ", "Gannon", "", "093 1234567",101,"H54 HD53"));
        assertEquals("Data is empty",e.getMessage());
    }
    @Test
    void emailFail(){
        //testing empty email
        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployees = new employees("Conor", "Gannon", "", "093 1234567",101,"H54 HD53"));
        assertEquals("Invalid email address must have @ ",e.getMessage());
    }
    @Test
    void phoneNumberFail(){
        //testing empty phone number
        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployees = new employees("Conor", "Gannon", "conorjgannon@gmail.com", "",101,"H54 HD53"));
        assertEquals("Invalid Phone number length ",e.getMessage());//tets
    }
    @Test
    void EmployeeNumberFail(){
        //testing empty EmployeeNumber
        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployees = new employees("Conor", "Gannon", "conorjgannon@gmail.com", "093 1234567",0,"H54 HD53"));
        assertEquals("Invalid number length ",e.getMessage());
    }

    @Test
    void addressFail(){
        //testing empty address
        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployees = new employees("Conor", "Gannon", "conorjgannon@gmail.com", "093 1234567",101,"1234"));
        assertEquals("Invalid post code length ",e.getMessage());
    }
}