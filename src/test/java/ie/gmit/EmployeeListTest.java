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
        employees e1 = new employees(" ", "kenny", "conork@gmail", "1234567890", 121, "loughrea");
        NewList = new EmployeeList();
        NewList.addEmployee(e1);

        assertEquals(true, NewList.SearchEmployee(e1));
    }
}
