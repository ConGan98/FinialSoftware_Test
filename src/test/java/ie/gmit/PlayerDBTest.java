package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerDBTest {

    private PlayerDB NewList;
    private players p1;

    @BeforeEach
    void init() {
    }

    @Test
    void addEmployee() {
        players p1 = new players("conor ", "kenny", "conork@gmail", "1234567890", 6, "loughrea");
        NewList = new PlayerDB();
        NewList.addPlayer(p1);

        assertEquals(true, NewList.SearchPlayer(p1));
    }

    @Test
    void addEmployeeDup(){
        //Test to catch a error Dup of Employee
        NewList = new PlayerDB();
        players p2 = new players("Conor","kenny","conork@gmail","1234567890",6,"loughrea");
        NewList.addPlayer(p2);

        Exception e = assertThrows(IllegalArgumentException.class,()->  NewList.addPlayer(p2));


        assertEquals("player data already exists",e.getMessage());
    }

    @Test
    void removePlayer(){
        //Test to find if employee exists to remove
        players p4 = new players("Conor","kenny","conork@gmail","1234567890",6,"loughrea");
        NewList = new PlayerDB();
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.deletePlayer(p4));
        assertEquals("player data does not exist",e.getMessage());
    }

    @Test
    void removePlayerSuccess(){
        //Test to find if employee exists to remove
        players p4 = new players("Conor","kenny","conork@gmail","1234567890",6,"loughrea");
        NewList = new PlayerDB();
        NewList.addPlayer(p4);
        NewList.deletePlayer(p4);


    }

    @Test
    void searchEmployeeFail(){
        players p4 = new players("Conor","kenny","conork@gmail","1234567890",6,"loughrea");
        NewList = new PlayerDB();
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.SearchPlayer(p4));
        assertEquals("player data does not exist",e.getMessage());
    }

    @Test
    void cannotFind(){
        NewList = new PlayerDB();
        players p4 = new players("Conor","kenny","conork@gmail","1234567890",6,"loughrea");
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.deletePlayer(p4));
        assertEquals("player data does not exist",e.getMessage());
    }
}
