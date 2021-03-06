public class Perisai extends Item{
    private int defense;
    private int maksDefense;

    public Perisai() {
        setNama("Perisai Kayu");
        maksDefense = 50;
        setLevel(1);
        setHargaBeli(20);
        setHargaJual(10);
        setHargaPenaikanLevel(3);
        defense = hitungDefense();
        setJenisItem("Perisai");
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMaksDefense() {
        return maksDefense;
    }

    public void setMaksDefense(int maksDefense) {
        this.maksDefense = maksDefense;
    }

    int hitungDefense() {
        int defense = 0;
        switch (getLevel()) {
            case 1:
                defense = 20 * maksDefense / 100;
                break;
            case 2:
                defense = 40 * maksDefense / 100;
                break;
            case 3:
                defense = 60 * maksDefense / 100;
                break;
            case 4:
                defense = 80 * maksDefense / 100;
                break;
            case 5:
                defense = 100 * maksDefense / 100;
                break;
        }

        return defense;
    }

    void printDeskripsi(Perisai perisai) {
        if (perisai == null) {
            System.out.println("Data Perisai Kosong");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("Deskripsi Perisai Yang Digunakan ");
            System.out.println("----------------------------------------------------");
            System.out.println("Nama  : "+perisai.getNama());
            System.out.println("Defense  : "+perisai.defense);
            System.out.println("Level  : "+perisai.getLevel());
        }
    }
}
