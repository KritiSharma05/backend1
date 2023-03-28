package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class FibTest {
    Fib f;
    @BeforeEach
    public void setup()
    {
        f=new Fib();
    }
    @AfterEach
    public void teardown()
    {
        f=null;
    }
    @Test
    public void test1()
    {
        List<Integer> res=f.fibseries(7);
        assertEquals(Arrays.asList(0,1,1,2,3,5,8),res);
    }
}
