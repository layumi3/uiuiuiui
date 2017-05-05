package model;

/**
 * Created by lacorp on 5/13/2016.
 */
public class Track {

    private int id;
    private String asal;
    private String tujuan;
    private String mobil;
    private String nopol;
    private String driver;
    private String peminjam;

    private String username;
    private String password;

    private  double latitude;
    private  double longitude;

    /*Empty Constructor*/
//    public Track(String username, String password){
//
//    }
    public Track(String carName, String nopol, String depart, String arrive, String requester){

    }
    public Track(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
    }

    public Track(int id, String asal, String tujuan,String mobil,String nopol,String driver,String peminjam ){
        this.setId(id);
        this.setAsal(asal);
        this.setTujuan(tujuan);
        this.setMobil(mobil);
        this.setNopol(nopol);
        this.setDriver(driver);
        this.setPeminjam(peminjam);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
