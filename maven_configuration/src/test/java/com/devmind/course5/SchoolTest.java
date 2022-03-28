package com.devmind.course5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SchoolTest {
    private static School school;

    @BeforeClass
    public static void globalSetUp(){
        school = new School("DEVMIND", new Address("BLD. Timisoara"));
    }

    @Before
    public static void setValue(){
        school.updateName("DEVMIND");
    }

    @Test(expected=NullPointerException.class)
    public void testisPalindrome_withNullValue_expectNullPointer() {
        school.updateName(null);
        Assert.assertEquals(school.isPalindrome(),false);
    }
}
