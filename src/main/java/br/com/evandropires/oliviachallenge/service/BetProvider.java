package br.com.evandropires.oliviachallenge.service;

import br.com.evandropires.oliviachallenge.dao.BetDAO;
import br.com.evandropires.oliviachallenge.dao.impl.BetDAOImpl;

/**
 * Created by evandro on 10/12/18.
 */
public class BetProvider {

    private BetDAO dao;

    public BetProvider() {
        this.dao = new BetDAOImpl();
    }

    public BetProvider(BetDAO dao) {
        this.dao = dao;
    }

    public BetDAO getDao() {
        return dao;
    }
}

