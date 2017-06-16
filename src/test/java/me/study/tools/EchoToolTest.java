package me.study.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by exuanlu on 6/16/2017.
 */
public class EchoToolTest {
    @Test
    public void testEcho() {
        String msg = "hello world";
        Assert.assertEquals(msg, EchoTool.echo(msg));
    }
}
