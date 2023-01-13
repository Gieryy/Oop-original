package POJO;

public class Kopi {
    private int kopiId;
    private String kopiName;
    private String kopiDescription;
    private int kopiQty;
    private double kopiPrice;

    public Kopi(){
    
    }

    public int getKopiId() {
        return kopiId;
    }

    public void setKopiId(int kopiId) {
        this.kopiId = kopiId;
    }

    public String getKopiName() {
        return kopiName;
    }

    public void setKopiName(String kopiName) {
        this.kopiName = kopiName;
    }

    public String getKopiDescription() {
        return kopiDescription;
    }

    public void setKopiDescription(String kopiDescription) {
        this.kopiDescription = kopiDescription;
    }

    public int getKopiQty() {
        return kopiQty;
    }

    public void setKopiQty(int kopiQty) {
        this.kopiQty = kopiQty;
    }

    public double getKopiPrice() {
        return kopiPrice;
    }

    public void setKopiPrice(double kopiPrice) {
        this.kopiPrice = kopiPrice;
    }
}