package com.example;

import junit.framework.Assert;
import junit.framework.TestCase;
public class ApplicationTest extends TestCase {
    SimpleCalculator cal = new SimpleCalculator();
    
    public void testAdd() {
        Assert.assertEquals(cal.add(10, 20),30);
    }
    public void testMultiply() {
        Assert.assertEquals(cal.multi(-10, -20), 200);
    }
}
