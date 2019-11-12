
public class product {
    private int id;
    private String marka;
    private String model;
    private String aciklama;
    private String depo;
    private int fiyat;
    
    
    public product(int id, String marka, String model, String aciklama, String depo, int fiyat) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.aciklama = aciklama;
        this.depo = depo;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDepo() {
        return depo;
    }

    public void setDepo(String depo) {
        this.depo = depo;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    
    
}
