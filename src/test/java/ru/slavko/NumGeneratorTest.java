package ru.slavko;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumGeneratorTest {

    @Test
    public void generateNum() {
        Assert.assertEquals(NumGenerator.generateNum(List.of(2)) , "01");
        Assert.assertEquals(NumGenerator.generateNum(List.of(1,2)) , "011");
        Assert.assertEquals(NumGenerator.generateNum(List.of(1,2,3)) , "100");
        Assert.assertEquals(NumGenerator.generateNum(List.of(1,2,3,4,5,7,8)) , "110");
        Assert.assertEquals(NumGenerator.generateNum(List.of(1,2,3,4,7,8)) , "101");
    }
}