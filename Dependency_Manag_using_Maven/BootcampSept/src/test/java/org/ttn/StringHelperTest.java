package org.ttn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

@Before
   public void Before(){
    System.out.println("This is Before");

}

@After
  public void After(){
    System.out.println("this is after");
}

    @Test
    public void truncateAInFirst2Positions() {
        StringHelper helper = new StringHelper();
        String actual =  helper.truncateAInFirst2Positions("ABCD");
        String expected = "BCD";
        assertEquals(actual,expected);
        System.out.println("this truncateAInFirst2Positions");
    }

    @Test
   /* public void areFirstAndLastTwoCharactersTheSame() {
        StringHelper helper = new StringHelper();
        String actual =  helper.truncateAInFirst2Positions("CCCC");
        String expected = "true";
        assertEquals(actual,expected);
        System.out.println("t areFirstAndLastTwoCharactersTheSame");
    }*/

    public void truncateAInFirst2Positions2() {
        StringHelper helper = new StringHelper();
        String actual =  helper.truncateAInFirst2Positions("BCD");
        String expected = "BCD";
        assertEquals(actual,expected);
        System.out.println("this truncateAInFirst2Positions");
    }
}
