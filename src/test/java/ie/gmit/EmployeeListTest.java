package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeListTest {

    private EmployeeList NewList;
    private employees e1;

    @BeforeEach
    void init() {
    }

    @Test
    void addEmployee() {
        employees e1 = new employees("conor ", "kenny", "conork@gmail", "1234567890", 121, "loughrea");
        NewList = new EmployeeList();
        NewList.addEmployee(e1);

        assertEquals(true, NewList.SearchEmployee(e1));
    }

    @Test
    void addEmployeeDup(){
        //Test to catch a error Dup of Employee
        NewList = new EmployeeList();
        employees e2 = new employees("Conor","kenny","conork@gmail","1234567890",121,"loughrea");
        NewList.addEmployee(e2);

        Exception e = assertThrows(IllegalArgumentException.class,()->  NewList.addEmployee(e2));


        assertEquals("Employee data already exists",e.getMessage());
    }

    @Test
    void deleteEmployee(){
        //test to remove a Employee
        employees e4 = new employees("Conor","kenny","conork@gmail","1234567890",121,"loughrea");
        NewList = new EmployeeList();
        NewList.addEmployee(e4);


        assertEquals(true,NewList.SearchEmployee(e4));
      //  NewList.deleteEmployee(e4);
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.SearchEmployee(e4));
        assertEquals("Employee data does not exist",e.getMessage());
    }
}
