package br.com.ebac.hz;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {

    @Test
    public void test(){
    String nome ="Felipe";
    Assert.assertEquals("Felipe", nome);
}

    @Test
    public void testNotEquals(){
        String nome ="Felipe";
        Assert.assertNotEquals("Felipe1", nome);
    }

}
