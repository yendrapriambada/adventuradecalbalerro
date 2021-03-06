import java.util.Scanner;

//Class Interface

public class GameEngine {
    Senjata senjata = new Senjata();
    Perisai perisai = new Perisai();
    Kostum kostum = new Kostum();
    Wilayah wilayah = new Wilayah();
    ObjekPlayer player = new ObjekPlayer();
    Scanner sc = new Scanner(System.in);
    boolean isStop = false;

    public GameEngine() {
        isiPerisai();
        isiSenjata();
        isiKostum();
        isiWilayah();
        loopMenuAwal();
    }

    public void pause() {
        System.out.print("\nPress Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        System.out.println("\n");
    }

    public void setStory1(){
        System.out.println("\n\n\n|----------------------------------------------------------------------------------------------------------------|\n" +
                "| Pada suatu ketika munculah seorang kesatria Langit,                                                            |\n" +
                "| di Kota Moskawa dengan membawa cincin keabadian yang telah jatuh sejak masa kegelapan.                         |\n"+
                "| Cincin itu bisa membawa sang kesatria menuju Kerajaan Andromeda yang telah mengalami keruntuhan                |\n"+
                "| Sang kesatria kemudian bertemu dengan Raja Nyctophillic,                                                       |\n" +
                "| lalu sang raja memberikan misi penyelamatan pada Ksatria Langit untuk menemukan Sang Putri Ranivary yang      |\n" +
                "| telah diculik oleh Pangeran Kegelapan Lord Hellsprint di Quil keabadian melalui cincin itu                     |\n"+
                "| Namun, untuk bisa mendapatkan akses menuju Quil keabadian itu,                                                 |\n" +
                "| Sang Kesatria harus mencari 5 bola elemental yang sudah menghilang sejak masa kegelapan.                       |\n"+
                "| Menurut desas-desus ke-5 bola elemental itu dijaga oleh masing-masing iblis di muka bumi ini.                  |\n" +
                "| Iblis tanah, Iblis api, Iblis air, Iblis angin. Dan yang satunya berada di sebuah perairan.                    |\n"+
                "|----------------------------------------------------------------------------------------------------------------|\n\n");
        pause();
    }

    public void menuAwal() {
        int pilihan = 0;

        System.out.println("-----------------------------------------------------");
        System.out.println("  ~8~8~8~*~*~*~9~9~9~8~8~8~*~*~*~9~9~9~8~8~8~*~*~*~  ");
        System.out.println("-----------------------------------------------------");
        System.out.println("             { Adventura de Caballero }              ");
        System.out.println("-----------------------------------------------------");
        System.out.println("  ~8~8~8~*~*~*~9~9~9~8~8~8~*~*~*~9~9~9~8~8~8~*~*~*~  ");
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Mulai Permainan");
        System.out.println("2. Keluar");
        System.out.println("-----------------------------------------------------");
        System.out.print("Masukan pilihan anda :");
        pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                player.isStop = false;
                player.isLoopAksi = false;
                setStory1();
                detailKarakter();
                pilihKarakter();
                player.loopAksi();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan yang anda masukan tidak tersedia");
                pause();
        }
    }

    public void loopMenuAwal() {
        while (!isStop) {
            menuAwal();
        }
    }

    public void detailKarakter() {
        System.out.println("_______________________________________________________________________________________________________\n");
        System.out.println(".... : Haii, Selamat Datang");pause();
        System.out.println(".... : Terdapat 4 kesatria langit yang dapat anda pilih, untuk menyelamatkan sang putri");pause();
        System.out.println(".... : Untuk memulai permainan, langkah pertama adalah pilihlah salah satu dari ke 4 kesatria tersebut");pause();
        System.out.println(".... : Berikut akan saya, tampilkan terlebih dahulu setiap karakteristik para kesatria");pause();
        System.out.println("_______________________________________________________________________________________________________\n");
        player.printData(player.braceHarison);pause();
        System.out.println("_______________________________________________________________________________________________________\n");
        player.printData(player.goldwinMiller);pause();
        System.out.println("_______________________________________________________________________________________________________\n");
        player.printData(player.marcelloParker);pause();
        System.out.println("_______________________________________________________________________________________________________\n");
        player.printData(player.marvinJensen);pause();
        System.out.println("_______________________________________________________________________________________________________\n");
    }

    public void pilihKarakter() {
        player.mulaiPilihKarakter();
        if (player.playerPilihan == null) {
            System.out.println(".... : Sampai Jumpa, pilihlah karakter dilain kesempatan \"");
        } else {
            player.printData(player.playerPilihan);pause();
            System.out.println("-------------------------------------------------------------------------------------------------------\n");
            System.out.println(".... : Pilihan yang tepat, Selamat Datang "+player.playerPilihan.getNama());
            System.out.println("-------------------------------------------------------------------------------------------------------\n");
        }
        pause();
    }

    public void isiSenjata() {
        player.senjata = senjata;
    }

    public void isiPerisai() {
        player.perisai = perisai;
    }

    public void isiKostum() {
        player.kostum = kostum;
    }

    public void isiWilayah() {
        player.wilayah = wilayah;
    }

}
