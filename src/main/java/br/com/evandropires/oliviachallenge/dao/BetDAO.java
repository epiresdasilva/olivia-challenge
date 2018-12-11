package br.com.evandropires.oliviachallenge.dao;

import br.com.evandropires.oliviachallenge.dto.BetDTO;

import java.util.List;

/**
 * Created by evandro on 10/12/18.
 */
public interface BetDAO {

    void addBet(BetDTO bet);
    List<BetDTO> listBet();

}
