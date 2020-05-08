package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class PlayerDB {
    List<players> NewList = new ArrayList<>();

    public void addPlayer(players player){


        if(NewList.contains(player) != false){
            throw new IllegalArgumentException("player data already exists");
        }
        else {
            NewList.add(player);
        }
    }

    public void deletePlayer(players player){

        boolean result = NewList.contains(player);
        if(result == true){
            NewList.remove(player);
        }
        else{
            throw new IllegalArgumentException("player data does not exist");

        }
    }

    public boolean SearchPlayer (players player){

        boolean result = NewList.contains(player);
        if(result == true){
            return result;
        }
        else{
            throw new IllegalArgumentException("player data does not exist");

        }
    }




}