package br.com.evandropires.oliviachallenge.dao.impl;

import br.com.evandropires.oliviachallenge.dao.BetDAO;
import br.com.evandropires.oliviachallenge.dao.util.ConnectionUtil;
import br.com.evandropires.oliviachallenge.dto.BetDTO;
import br.com.evandropires.oliviachallenge.jooq.tables.Bet;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by evandro on 10/12/18.
 */
public class BetDAOImpl implements BetDAO {

    @Override
    public void addBet(BetDTO bet) {
        try (Connection conn = ConnectionUtil.newConnection()) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            create.insertInto(Bet.BET)
                    .set(Bet.BET.NAME, bet.getName())
                    .set(Bet.BET.EMAIL, bet.getEmail())
                    .set(Bet.BET.HEIGHT, bet.getHeight())
                    .set(Bet.BET.WEIGHT, bet.getWeight())
                    .set(Bet.BET.BORN, new Timestamp(bet.getBorn().getTime()))
                    .set(Bet.BET.HAIRY, bet.getHairy())
                    .execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<BetDTO> listBet() {
        try (Connection conn = ConnectionUtil.newConnection()) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            return create.select()
                    .from(Bet.BET)
                    .fetch()
                    .into(BetDTO.class);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
