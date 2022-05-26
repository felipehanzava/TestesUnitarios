package br.com.ebac.hz;

import org.junit.Assert;
import org.junit.Test;


public class TesteClienteTest {

    @Test
    public void testeClasseCliente(){
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Felipe");

        Assert.assertEquals("Felipe", cli.getNome());
    }


}
