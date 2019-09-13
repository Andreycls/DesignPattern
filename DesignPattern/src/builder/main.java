package builder;

public class main {
    public static void main(String[] args) {
        Mahasiswa.MahasiswaBuilder mhs = new Mahasiswa.MahasiswaBuilder("Andrey","nyot")
                .setUmur(20)
                .setUang(30);
    }
}
