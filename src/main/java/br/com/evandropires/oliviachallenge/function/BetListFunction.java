package br.com.evandropires.oliviachallenge.function;

import br.com.evandropires.oliviachallenge.dto.BetDTO;
import br.com.evandropires.oliviachallenge.service.BetService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.text.ParseException;
import java.util.List;

public class BetListFunction {
    public static JsonObject main(JsonObject payload) throws ParseException {
        List<BetDTO> bets = new BetService().listBet();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
        String betsJson = gson.toJson(bets);

        JsonObject response = new JsonObject();
        response.add("results", gson.fromJson(betsJson, JsonArray.class));
        return response;
    }
}
