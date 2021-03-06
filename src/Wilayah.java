public class Wilayah {
    private String nama;
    private String item;

    Wilayah[] wilayah = new Wilayah[3];

    public Wilayah() {
        wilayah[0].nama = "Kota kiev";
        wilayah[0].item = "Kapal Bajak Laut";

        wilayah[1].nama = "Sungai Bucharest ";
        wilayah[1].item = "Tidak ada item yang di dapat";

        wilayah[2].nama = "Goa Praha";
        wilayah[2].item = "Sorcerer Stone";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void printWilayahAll() {
        if (wilayah == null) {
            System.out.println("Data Wilayah Kosong");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println(" Wilayah-wilayah yang harus anda lalui");
            System.out.println("----------------------------------------------------");
            int i = 1;
            for (Wilayah n: wilayah) {
                System.out.println(i+". "+n);
                i++;
            }
        }
    }
}
