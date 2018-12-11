package br.com.evandropires.oliviachallenge.dto;

import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by evandro on 10/12/18.
 */
public class BetDTO {

    private String name;
    private String email;
    private BigDecimal height;
    private BigDecimal weight;
    private Date born;
    private Boolean hairy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Boolean getHairy() {
        return hairy;
    }

    public void setHairy(Boolean hairy) {
        this.hairy = hairy;
    }

    public static BetDTO parse(JsonObject betJson) throws ParseException {
        String name = betJson.get("name").getAsString();
        String email = betJson.get("email").getAsString();
        BigDecimal height = betJson.get("height").getAsBigDecimal();
        BigDecimal weight = betJson.get("weight").getAsBigDecimal();
        String born = betJson.get("born").getAsString();
        Boolean hairy = betJson.get("hairy").getAsBoolean();

        BetDTO betDTO = new BetDTO();
        betDTO.setName(name);
        betDTO.setEmail(email);
        betDTO.setHeight(height);
        betDTO.setWeight(weight);
        betDTO.setBorn(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(born));
        betDTO.setHairy(hairy);
        return betDTO;
    }

}
