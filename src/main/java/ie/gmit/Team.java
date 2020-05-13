package ie.gmit;
/*Conor Kenny 09/05/20 G00352227
* class for entering details of the team such as number of squads,player numbers,team name and number of coaches  */
public class Team {

    private String name;
    private int player_count;
    private int squads;
    private int managers_count;
    private int coaches;

    public Team(String name, int player_count, int squads, int managers_count, int coaches) {
        if(name == " " || player_count == 0 || squads == 0 || managers_count == 0 || coaches == 0){
            throw new IllegalArgumentException("Data is empty");
        }
        else {
            setName(name);
            setPlayer_count(player_count);
            setSquads(squads);
            setManagers_count(managers_count);
            setCoaches(coaches);

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayer_count() {
        return player_count;
    }

    public void setPlayer_count(int player_count) {
        this.player_count = player_count;
    }

    public int getSquads() {
        return squads;
    }

    public void setSquads(int squads) {


        if(player_count >= squads){
            this.squads = squads;
        }
        else {
            throw new IllegalArgumentException("Invalid amount of players for number of squads");
        }

    }

    public int getManagers_count() {
        return managers_count;
    }

    public void setManagers_count(int managers_count) {


            this.managers_count = managers_count;

    }

    public int getCoaches() {
        return coaches;
    }

    public void setCoaches(int coaches) {

        if(coaches < squads){
            throw new IllegalArgumentException("Invalid amount of coaches, a squad has no coach");
        }
        else{
            this.coaches = coaches;
        }

    }


}