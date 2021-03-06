package ie.gmit;
/* Conor Kenny G00352227
Junit Tests for PlayerDBTest class */

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
    void addPlayer() {
        players p1 = new players("Paul ", "Pogba", "pPogba@gmail", "1234567890", 6, "1234567");
        NewList = new PlayerDB();
        NewList.addPlayer(p1);

        assertEquals(true, NewList.SearchPlayer(p1));
    }

    @Test
    void addPlayerDuplicate(){

        NewList = new PlayerDB();
        players p2 = new players("Paul","Pogba","pPogba@gmail","1234567890",6,"loughrea");
        NewList.addPlayer(p2);

        Exception e = assertThrows(IllegalArgumentException.class,()->  NewList.addPlayer(p2));


        assertEquals("player data already exists",e.getMessage());
    }

    @Test
    void removePlayer(){

        players p4 = new players("Paul","Pogba","pPogba@gmail","1234567890",6,"loughrea");
        NewList = new PlayerDB();
        Exception e = assertThrows(IllegalArgumentException.class,()-> NewList.deletePlayer(p4));
        assertEquals("player data does not exist",e.getMessage());
    }

    @Test
    void removePlayerSuccess(){

        players p4 = new players("Paul","Pogba","pPogba@gmail","1234567890",6,"loughrea");
        NewList = new PlayerDB();
        NewList.addPlayer(p4);
        NewList.deletePlayer(p4);


    }

    @Test
    void searchPlayerFail(){
        players p4 = new players("Paul","Pogba","pPogba@gmail","1234567890",6,"loughrea");
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
