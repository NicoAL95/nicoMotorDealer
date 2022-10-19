import java.util.Scanner;

public class Dealer {

    private Scanner inputDataDealer;

    private String nama = "";
    private String brand = "";
    private int cc = 0;
    private int harga = 0;
    private String waktu ="";

    public Dealer() {
        inputDataDealer = new Scanner(System.in);
    }

    public int setZero(){
        this.harga = 0; 
        return this.harga;
    }

    public String setSpace(){
        this.nama = ""; 
        return this.nama;
    }

    public void setNamaMotor(){
        System.out.print("Nama Motor: ");
        this.nama = inputDataDealer.nextLine();
    }

    public void setBrandMotor(){
        System.out.print("Brand Motor: ");
        this.brand = inputDataDealer.nextLine();
    }
    public void setCCMotor(){
        System.out.print("CC Motor: ");
        this.cc = inputDataDealer.nextInt();
    }

    public void setHargaMotor(){
        System.out.print("Harga Motor: ");
        this.harga = inputDataDealer.nextInt();
    }

    public void setWaktu(String inp){
        this.waktu = inp;
    }

    public String getNama(){
        return this.nama;
    }

    public String getBrand(){
        return this.brand;
    }
    public int getCC(){
        return this.cc;
    }

    public int getHarga(){
        return this.harga;
    }

    public String getWaktu(){
        return this.waktu;
    }

}
