public class Senjata extends Item{
    private int atk;
    private int maksAtk;

    public Senjata() {
        setNama("Pisau");
        maksAtk = 100;
        setLevel(1);
        setHargaBeli(20);
        setHargaJual(10);
        setHargaPenaikanLevel(3);
        atk = hitungAtk();
        setJenisItem("Senjata");
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    int hitungAtk() {
        int atk = 0;
        switch (getLevel()) {
            case 1:
                atk = 20 * maksAtk / 100;
                break;
            case 2:
                atk = 40 * maksAtk / 100;
                break;
            case 3:
                atk = 60 * maksAtk / 100;
                break;
            case 4:
                atk = 80 * maksAtk / 100;
                break;
            case 5:
                atk = 100 * maksAtk / 100;
                break;
        }

        return atk;
    }

    void printDeskripsi(Senjata senjata) {
        if (senjata == null) {
            System.out.println("Data Senjata Kosong");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("Deskripsi Senjata Yang Digunakan ");
            System.out.println("----------------------------------------------------");
            System.out.println("Nama  : "+senjata.getNama());
            System.out.println("Atk  : "+senjata.atk);
            System.out.println("Level  : "+senjata.getLevel());
        }
    }
}