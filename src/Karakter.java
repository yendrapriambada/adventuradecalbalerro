import java.util.Scanner;

public class Karakter {
    private String nama;
    private int hp;
    private int atk;
    private int defense;
    private int mp;
    private int exp;
    private int level;
    private int koin;

    Scanner sc = new Scanner(System.in);

    Senjata senjata;
    Perisai perisai;
    Kostum kostum;
    Wilayah wilayah;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void hapusData(Karakter karakterHapus) {
        karakterHapus = null;
    }

    public int getKoin() {
        return koin;
    }

    public void setKoin(int koin) {
        this.koin = koin;
    }

    public void printData(Karakter karakterPrint) {
        if (karakterPrint == null) {
            System.out.println("Data Karakter Kosong");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("Deskripsi Karakter ");
            System.out.println("----------------------------------------------------");
            System.out.println("Nama  : "+karakterPrint.nama);
            System.out.println("Hp  : "+karakterPrint.hp);
            System.out.println("Atk  : "+karakterPrint.atk);
            System.out.println("Defense  : "+karakterPrint.defense);
            System.out.println("Mp  : "+karakterPrint.mp);
            System.out.println("Exp  : "+karakterPrint.exp);
            System.out.println("Level  : "+karakterPrint.level);
        }
    }

    public void penambahanLevel() {

    }

    public void ubahNamaKarakter() {

    }

    public void aksiPerang() {

    }

    public void aksiMenghindar() {

    }
}