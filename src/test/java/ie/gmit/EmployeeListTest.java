package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



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
    void removeEmployee(){
        //Test to find if employee exists to remove
        employees e4 = new employees("Conor","kenny","conork@gmail","1234567890",121,"loughrea");
        NewList = new EmployeeList();
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.deleteEmployee(e4));
        assertEquals("Employee data does not exist",e.getMessage());
    }

    @Test
    void removeEmployeeSuccess(){
        //Test to find if employee exists to remove
        employees e4 = new employees("Conor","kenny","conork@gmail","1234567890",121,"loughrea");
        NewList = new EmployeeList();
        NewList.addEmployee(e4);
        NewList.deleteEmployee(e4);


    }

    @Test
    void searchEmployeeFail(){
        employees e4 = new employees("Conor","kenny","conork@gmail","1234567890",121,"loughrea");
        NewList = new EmployeeList();
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.SearchEmployee(e4));
        assertEquals("Employee data does not exist",e.getMessage());
    }

    @Test
    void cannotFind(){
        NewList = new EmployeeList();
        employees e4 = new employees("Conor","kenny","conork@gmail","1234567890",121,"loughrea");
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.deleteEmployee(e4));
        assertEquals("Employee data does not exist",e.getMessage());
    }
}
