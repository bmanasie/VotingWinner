package org.winnervote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoteWinner {


    String findWinner(List<String> votes){
        Map<String,Integer> mapVotes = new HashMap<>();
        int maxVotes = 0;
        String winner = null;
        int counter=3;

        if (votes.size() == 0) return "No Winner";

        for(String vote:votes){
            if(counter ==0) counter =3;

            if(mapVotes.get(vote)!=null){

                mapVotes.put(vote, mapVotes.get(vote) + counter);

                if( !vote.equals("") && mapVotes.get(vote)>= maxVotes){

                    maxVotes =mapVotes.get(vote);
                    winner = vote;
                }
            }
            else{
                mapVotes.put(vote, counter);

            }
            counter--;
        }

        System.out.println(mapVotes);


        return winner;

    }

}
