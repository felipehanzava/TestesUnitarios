package br.com.ebac.hz.dao;

public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona Banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não encontrado no Banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não foi possivel excluir");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não foi possivel Atualizar");
    }
}
