package ie.gmit;
/* Conor Kenny G00352227
Junit Tests for team class */

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
    void addTeamfail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team(" ", 100,  5,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addTeamfail1(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 0,  5,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addTeamfail2(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 100,  0,5,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addTeamfail3(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 100,  5,0,101));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void addTeamfail4(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Manchester United ", 100,  5,5,0));
        assertEquals("Data is empty",e.getMessage());
    }

    @Test
    void playerNosfail(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Man united ", 1,  4,3,101));
        assertEquals("Invalid amount of players for number of squads",e.getMessage());
    }



    @Test
    void Coachsfail2(){

        Exception e = assertThrows(IllegalArgumentException.class,()-> myTeam = new Team("Man United", 100,  5,5,4));
        assertEquals("Invalid amount of coaches, a squad has no coach",e.getMessage());
    }


}
