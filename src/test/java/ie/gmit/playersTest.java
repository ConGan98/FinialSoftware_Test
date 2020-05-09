package ie.gmit;
/* Conor Kenny G00352227
Junit Tests for players class */

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

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Juan", " ", "jMATA@gmsil", "093 1234567",8,"H54 H993"));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void emptydataFail2(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("juan ", "mata", " ", "093 1234567",8,"H54 H993"));
        assertEquals("Data is empty",e.getMessage());
    }
    @Test
    void emptydataFail3(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("De Gea ", "Davide", "dg@gmai;.com ", " ",1,"H54 HD99"));
        assertEquals("Data is empty",e.getMessage());
    }



    @Test
    void emptydataFail4(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Anthony ", "Martial", "AM@gmsil", "093 1233567",9," "));
        assertEquals("Data is empty",e.getMessage());
    }
    @Test
    void emailFail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("James", "Daniel", "DGgmail ", "093 1234267",22,"H54 H443"));
        assertEquals("Invalid email address must have @ ",e.getMessage());
    }
    @Test
    void phoneNumberFail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Paul", "Pogba", "pPogba@gmail.com", "566 ",6,"H54 HD53"));
        assertEquals("Invalid Phone number length ",e.getMessage());//tets
    }
    @Test
    void PlayerNumberFail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Marcus", "Rashford", "mr@gmail.com", "093 1234567",100,"H54 HD53"));
        assertEquals("Invalid squad number",e.getMessage());
    }

    @Test
    void addressFail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myplayers = new players("Paul", "Pogba", "pPogba@gmail.com", "093 1234567",6,"1234"));
        assertEquals("Invalid post code length ",e.getMessage());
    }
}