public class Kostum extends Item {
    private int defense;

    public Kostum() {
        setNama("Legionnaire");
        setHargaBeli(50);
        setHargaJual(30);
        defense = 20;
        setJenisItem("Perisai");
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    void printDeskripsi(Kostum kostum) {
        if (kostum == null) {
            System.out.println("Data Kostum Kosong");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("Deskripsi Kostum Yang Digunakan ");
            System.out.println("----------------------------------------------------");
            System.out.println("Nama  : "+kostum.getNama());
            System.out.println("Defense  : "+kostum.defense);
        }
    }
}
