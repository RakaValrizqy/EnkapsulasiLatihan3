package latihan3;
public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    
    //method untuk mengisi absen
    public int getAbsen() {
        return absen;
    }
    //method untuk mengisi nama
    public String getName() {
        return name;
    }
    //method untuk mengisi alamat
    public String getAddress() {
        return address;
    }
    //method untuk menyimpan nilai absen
    public void setAbsen(int newAbsen) {
        absen = newAbsen;
    }
    //method untuk menyimpan nilai nama
    public void setName(String newName) {
        name = newName;
    }
    //method untuk menyimpan nilai alamat
    public void setAddress(String newAddress) {
        address = newAddress;
    }
}
