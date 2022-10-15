import java.util.Scanner;

public class Dealer {

    private Scanner inputDataDealer;

    private String nama = "";
    private int harga = 0;

    public Dealer() {
        inputDataDealer = new Scanner(System.in);
    }

    public int setFirstStart(){
        this.harga = 0; 
        return this.harga;
    }

    public void setNamaMotor(){
        System.out.print("Nama Motor: ");
        this.nama = inputDataDealer.nextLine();
    }

    public void setHargaMotor(){
        System.out.print("Harga Motor: ");
        this.harga = inputDataDealer.nextInt();
    }

    public String getNama(){
        return this.nama;
    }

    public int getHarga(){
        return this.harga;
    }

}
