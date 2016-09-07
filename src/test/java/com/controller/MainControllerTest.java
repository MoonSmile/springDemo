package com.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by apple on 16/9/3.
 */
public class MainControllerTest {
    @Test
    public void index() {
        String abcde = new MainController().hello("abcde");
        Assert.assertEquals(abcde,"fff");
    }

}