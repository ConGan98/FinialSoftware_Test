package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TeamTest {
    private Team myTeam;

    @BeforeEach
    void init(){
        myTeam = new Team("Manchester United", 100,  5,5,40);
    }
    @Test
    void addcompany(){
        assertEquals("Manchester United", myTeam.getName());
        assertEquals(100, myTeam.getPlayer_count());
        assertEquals(5, myTeam.getSquads());
        assertEquals(5, myTeam.getManagers_count());
        assertEquals(40, myTeam.getCoaches());
    }

    @Test
    void addComapanyfail(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team(" ", 100,  5,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail1(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 0,  5,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail2(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 100,  0,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail3(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 100,  5,0,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addComapanyfail4(){
        //company name is empty
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 100,  5,5,0));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void playerNosfail(){
        //testing to check if there is less managers than departments
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Conor's company", 1,  4,3,101));
        assertEquals("Invalid amount of players for number of squads",e.getMessage());
    }



    @Test
    void Coachsfail2(){
        //testing to check if there is less managers than departments
        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Conor's company", 100,  5,5,4));
        assertEquals("Invalid amount of coaches, a squad has no coach",e.getMessage());
    }


}
