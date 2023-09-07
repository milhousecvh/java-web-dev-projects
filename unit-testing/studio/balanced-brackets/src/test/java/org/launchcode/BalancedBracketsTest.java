package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    //1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //3
    @Test
    public void withWordsReturnsTrue() {
        String string = "[potato]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(string));
    }

    //4
    @Test
    public void stringWithMiddleBrackets() {
        String string = "pot[ato]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(string));
    }

    //5
    @Test
    public void withWrongBracketsReturnsFalse() {
        String string = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(string));
    }

    //6
    @Test
    public void bracketsAtTheFront() {
        String string = "[]potato";
        assertTrue(BalancedBrackets.hasBalancedBrackets(string));
    }

    //7
    @Test
    public void singleBracketAtString() {
        String string = "[potato";
        assertFalse(BalancedBrackets.hasBalancedBrackets(string));
    }

    //8
    @Test
    public void singleBracketAlone() {
        String string = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(string));
    }

    //9
    @Test
    public void outwardFacingBracketsInString() {
        String string = "pota]to[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(string));
    }

    //10
    @Test
    public void outwardBracketsAlone() {
        String string = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(string));
    }

    //11
    @Test
    public void noBracketsInString() {
        String string = "potato";
        assertTrue(BalancedBrackets.hasBalancedBrackets(string));
    }

    //12
    @Test
    public void twoSetsOneGoodFollowedByBad() {
        String string = "[]][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(string));
    }
}
