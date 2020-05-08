package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CompaniesTest {
    private Companies myCompanies;

    @BeforeEach
    void init(){
        myCompanies = new Companies("Conor's company", 100,  5,5,101);
    }
    @Test
    void addcompany(){
        assertEquals("Conor's company",myCompanies.getName());
        assertEquals(100,myCompanies.getEmployee_count());
        assertEquals(5,myCompanies.getDepartments());
        assertEquals(5,myCompanies.getManagers_count());
        assertEquals(101,myCompanies.getProject_count());
    }

    @Test
    void addComapanyfail(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies(" ", 100,  5,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail1(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies("comapp ", 0,  5,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail2(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies("comoa ", 100,  0,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail3(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies("comoa ", 100,  5,0,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail4(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies("comoa ", 100,  5,5,0));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void departmentsfail(){
        //testing to check if there is less managers than departments
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies("Conor's company", 1,  4,3,101));
        assertEquals("Invalid amount of managers for the departments",e.getMessage());
    }



    @Test
    void departmentsfail2(){
        //testing to check if there is less managers than departments
        Exception e = assertThrows(IllegalArgumentException.class,()-> myCompanies = new Companies("Conor's company", 100,  5,5,4));
        assertEquals("Invalid amount of projects, a department has no project",e.getMessage());
    }


}
