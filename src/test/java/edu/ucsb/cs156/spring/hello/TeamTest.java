package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    
    @Test 
    public void check_equals(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        
        String test = "test";

        Team samesame = new Team();
        samesame.setName("foo");
        samesame.addMember("bar");

        Team diff =new Team("test");
        samesame.setName("notfoo");
        samesame.addMember("notbar");

        assert(t1.equals(t1));
        assertEquals(t1.equals(test), false);
        assertEquals((t1.equals(diff)),false);
        // assertEquals(t1.getName().equals(diff.getName()),false);
    }

    @Test
    public void check_hash_values(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }
    @Test void check_hash_code(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

}
