package ultils;

import java.util.Objects;

public class StockData implements Comparable<StockData> {
    private String code;
    private String name;
    private Double lastDone;
    private String change;

    private String vol;

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

    public Double getLastDone() {
        if (Objects.equals(String.valueOf(lastDone), "-")) {
            return Double.parseDouble(String.valueOf(0));
        } else return lastDone;
    }

    public void setLastDone(Double lastDone) {
        this.lastDone = lastDone;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
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
        return "Employee [Code: " + code + " | Name: " + name + " | Last Done: " + lastDone + " | Change " + change + " | Vol " + vol + "]";
    }

    @Override
    public int compareTo(StockData stockData) {
        return new Double(lastDone).compareTo(stockData.lastDone);
    }
}
