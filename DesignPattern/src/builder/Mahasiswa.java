package builder;

public class Mahasiswa {

    String nama;
    String nim;
    int umur;
    int uang;
    String alamat;
    public Mahasiswa(String nama, String nim){
        this.nama=nama;
        this.nim=nim;

    }
    public static class MahasiswaBuilder{
        String nama;
        String nim;
        int umur;
        int uang;
        String alamat;

        public MahasiswaBuilder(String nama, String nim){
            this.nama = nama;
            this.nim=nim;
        }
        MahasiswaBuilder setUmur(int umur_){
            this.umur=umur_;
            return this;
        }
        MahasiswaBuilder setUang(int uang){
            this.uang=uang;
            return this;
        }
    }

}
