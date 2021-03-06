public class ObjekPlayer extends Karakter{
    //Method seluruh karakter dalam game
    Karakter goldwinMiller = new Karakter();
    Karakter marcelloParker = new Karakter();
    Karakter braceHarison = new Karakter();
    Karakter marvinJensen = new Karakter();
    Karakter playerPilihan; // kesatria pilihan user

    boolean isStop = false;
    boolean isLoopAksi = false;

    public ObjekPlayer() {
        isiObjekKarakter();
    }

    public void pause() {
        System.out.print("\nPress Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        System.out.println("\n");
    }

    public void isiObjekKarakter() {
        int defense = perisai.getDefense() + kostum.getDefense();
        //Buat Karakter Goldmin Miller
        goldwinMiller.setNama("Goldwin Miller");
        goldwinMiller.setMp(100);
        goldwinMiller.setHp(200);
        goldwinMiller.setLevel(1);
        goldwinMiller.setDefense(defense);
        goldwinMiller.setExp(0);
        goldwinMiller.setAtk(senjata.getAtk());
        goldwinMiller.setKoin(5);

        //Buat Karakter Marcello Parker
        marcelloParker.setNama("Marcello Parker");
        marcelloParker.setMp(100);
        marcelloParker.setHp(200);
        marcelloParker.setLevel(1);
        marcelloParker.setDefense(defense);
        marcelloParker.setExp(0);
        marcelloParker.setAtk(senjata.getAtk());
        marcelloParker.setKoin(5);

        //Buat Karakter Brace Harison
        braceHarison.setNama("Brace Harison");
        braceHarison.setMp(100);
        braceHarison.setHp(200);
        braceHarison.setLevel(1);
        braceHarison.setDefense(defense);
        braceHarison.setExp(0);
        braceHarison.setAtk(senjata.getAtk());
        braceHarison.setKoin(5);

        //Buat Karakter Marvin Jensen
        marvinJensen.setNama("Marvin Jensen");
        marvinJensen.setMp(100);
        marvinJensen.setHp(200);
        marvinJensen.setLevel(1);
        marvinJensen.setDefense(defense);
        marvinJensen.setExp(0);
        marvinJensen.setAtk(senjata.getAtk());
        marvinJensen.setKoin(5);
    }

    public void pilihKarakter() {
        int pilihan = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("Pilih Karakter yang akan anda mainkan ");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Goldwin Miller");
        System.out.println("2. Marcello Parker");
        System.out.println("3. Brace Harison");
        System.out.println("4. Marvin jensen");
        System.out.println("5. Batal");
        System.out.println("6. Keluar permainan");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukan pilihan anda :");
        pilihan = sc.nextInt();
        if (pilihan == 6) {
            System.exit(0);
        } else {
            switch (pilihan) {
                case 1:
                    karakterUser(goldwinMiller);
                    isStop=true;
                    break;
                case 2:
                    karakterUser(marcelloParker);
                    isStop=true;
                    break;
                case 3:
                    karakterUser(braceHarison);
                    isStop=true;
                    break;
                case 4:
                    karakterUser(marvinJensen);
                    isStop=true;
                    break;
                case 5:
                    isStop=true;
                    break;
                default:
                    System.out.println("Pilihan yang anda masukan tidak tersedia");
            }
        }
    }

    public void karakterUser(Karakter player) {
        playerPilihan = player;
    }

    public void mulaiPilihKarakter() {
        while (!isStop) {
            pilihKarakter();
        }
    }

    public void aksi() {
        int pilihan = 0;

        System.out.println("----------------------------------------------------");
        printData(playerPilihan);
        System.out.println("----------------------------------------------------");
        System.out.println(" 1. Lihat Magic Item yang dimiliki");
        System.out.println(" 2. Lihat Senjata yang dimiliki");
        System.out.println(" 3. Lihat Perisai yang dimiliki");
        System.out.println(" 4. Lihat Kostum yang dimiliki");
        System.out.println(" 6. Lihat Musuh yang sudah dikalahkan");
        System.out.println(" 7. Maps Wilayah");
        System.out.println(" 8. Jalankan Misi");
        System.out.println(" 0. Keluar");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukan pilihan anda :");
        pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:

                    isLoopAksi=true;
                    break;
                case 2:
                    senjata.printDeskripsi(senjata);
                    pause();
                    break;
                case 3:
                    perisai.printDeskripsi(perisai);
                    pause();
                    break;
                case 4:
                    wilayah.printWilayahAll();
                    pause();
                    break;
                case 0:
                    isLoopAksi=true;
                    break;
                default:
                    System.out.println("Pilihan yang anda masukan tidak tersedia");
            }
    }

    public void loopAksi() {
        while (!isLoopAksi) {
            aksi();
        }
    }

}
