package br.com.evandropires.oliviachallenge.function;

import br.com.evandropires.oliviachallenge.dto.BetDTO;
import br.com.evandropires.oliviachallenge.service.BetService;
import com.google.gson.JsonObject;

import java.text.ParseException;

public class BetFunction {
    public static JsonObject main(JsonObject payload) throws ParseException {
        BetDTO betDTO = BetDTO.parse(payload);
        new BetService().addBet(betDTO);

        JsonObject response = new JsonObject();
        response.add("payload", payload);
        return response;
    }
}
