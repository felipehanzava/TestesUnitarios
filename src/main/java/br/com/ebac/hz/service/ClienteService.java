package br.com.ebac.hz.service;

import br.com.ebac.hz.dao.ClienteDao;
import br.com.ebac.hz.dao.IClienteDao;

public class ClienteService {

    private IClienteDao iClienteDao;
    public ClienteService(IClienteDao iClienteDao){
       this.iClienteDao = iClienteDao;
    }

    public String salvar(){
        iClienteDao.salvar();
        return "Sucesso";
    }
}
