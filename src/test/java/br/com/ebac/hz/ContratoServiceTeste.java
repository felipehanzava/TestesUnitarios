package br.com.ebac.hz;

import br.com.ebac.hz.dao.ContratoDao;
import br.com.ebac.hz.dao.IContratoDao;
import br.com.ebac.hz.dao.mock.ContratoDaoMock;
import br.com.ebac.hz.service.ContratoService;
import br.com.ebac.hz.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTeste {

    @Test
    public void salvarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroNoSalvarTesteComBancoDeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    public void buscarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Encontrado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroNoBuscarTesteComBancoDeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Encontrado", retorno);
    }

    @Test
    public void excluirTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroNoExcluirTesteComBancoDeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido", retorno);
    }

    @Test
    public void atualizarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroNoAtualizarTesteComBancoDeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }
}
