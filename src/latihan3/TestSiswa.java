package latihan3;
public class TestSiswa {
    public static void main(String[] args) {
        //membuat objek siswa dari class EncapSiswa
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        //menampilkan data siswa
        System.out.println("Name : "+siswa.getName()
        + " Absen : " + siswa.getAbsen() +
        " Address : " + siswa.getAddress());
    }
    
}
