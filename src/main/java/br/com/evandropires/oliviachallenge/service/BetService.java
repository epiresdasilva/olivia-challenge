package br.com.evandropires.oliviachallenge.service;

import br.com.evandropires.oliviachallenge.dto.BetDTO;

/**
 * Created by evandro on 10/12/18.
 */
public class BetService {

    private BetProvider betProvider;

    public BetService() {
        this.betProvider = new BetProvider();
    }

    public BetService(BetProvider betProvider) {
        this.betProvider = betProvider;
    }

    private BetProvider getBetProvider() {
        return betProvider;
    }

    public void addBet(BetDTO bet) {
        getBetProvider().getDao().addBet(bet);
    }

}
