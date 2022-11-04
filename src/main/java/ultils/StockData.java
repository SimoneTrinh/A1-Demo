package ultils;

import java.util.Objects;

public class StockData {
    private String code;
    private String name;
    private String lastDone;
    private Double change;
    private String vol;

    public StockData(String code, String name, String lastDone, Double change, String vol) {
        this.code = code;
        this.name = name;
        this.lastDone = lastDone;
        this.change = change;
        this.vol = vol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastDone() {
        return lastDone;
    }

    public void setLastDone(String lastDone) {
        this.lastDone = lastDone;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Data: [Code: " + code + " | Name: " + name + " | Last Done: " + lastDone + " | Change: " + change + " | Vol: " + vol + "]";
    }
}
