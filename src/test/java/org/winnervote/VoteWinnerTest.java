package org.winnervote;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class VoteWinnerTest {


    void setUp() {


    }


    @Test
    public void testWinner(){

        VoteWinner winner = new VoteWinner();
        List<String> votes = Arrays.asList("A", "B", "C", "B", "A", "C", "B","C","A");
        Assert.assertEquals("B",winner.findWinner(votes));


    }
//    @Test
//    public void testWinnerWithSameValues(){
//
//        VoteWinner winner = new VoteWinner();
//        List<String> votes = Arrays.asList("A", "B", "B", "C", "A", "B", "A");
//        Assert.assertEquals("A",winner.findWinner(votes));
//
//    }
//    @Test
//    public void testWinnerWithNoValues(){
//
//        VoteWinner winner = new VoteWinner();
//        List<String> votes = new ArrayList<>();
//        Assert.assertEquals("No Winner",winner.findWinner(votes));
//
//    }
//    @Test
//    public void testWinnerWithEmptyStrings(){
//
//        VoteWinner winner = new VoteWinner();
//        List<String> votes = Arrays.asList("", "B", "", "C", "", "B", "A");
//        Assert.assertEquals("B",winner.findWinner(votes));
//
//
//    }
}