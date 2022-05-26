package br.com.ebac.hz;

import br.com.ebac.hz.dao.ClienteDao;
import br.com.ebac.hz.dao.mock.ClienteDaoMock;
import br.com.ebac.hz.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTeste {

    @Test
    public void salvarTest(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void erroNoSalvarTest(){
        ClienteDao clienteDao = new ClienteDao();
        ClienteService clienteService = new ClienteService(clienteDao);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
