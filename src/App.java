// UTS PBO - Nico Abel Laia (20215520010) - TI Semester 3 2022

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Escaper
        int esc = 0;
        int acc = 0;
        int back = 1;

        // Arrays
        int arrayTotal = 3;
        Dealer [] main = new Dealer[arrayTotal];

        // Fill Array Main Harga to 0
        for (int i = 0; i < main.length; i++) {
            Dealer temp = new Dealer();
            temp.setZero();
            main[i] = temp;
        }
    
        Scanner input = new Scanner(System.in);

        do {
            // Clear terminal
            System.out.print("\033\143");

            Admin ad = new Admin();
            System.out.print("Program Input Data Dealer Motor | ");
            ad.waktu();
            System.out.println("1. Masukkan Data\n2. Cek Daftar\n3. Komparasi Kendaraan\n4. Ubah Data Kendaraan\n5. Data Perusahaan\n6. Exit");

            System.out.print("Pilihan Anda: ");
            int inputUser = input.nextInt();
            switch (inputUser) {

                // Input Data
                case 1:

                // Clear terminal
                System.out.print("\033\143");

                // Restart Token
                esc = 0;
                acc = 0;

                    // Token Checker
                    for (int i = 0; i < main.length; i++) {
                        if (main[i].getHarga() == 0) {
                            esc++;
                        } else {
                            acc++;
                        }
                    }

                    if (acc < main.length) {

                        System.out.println("Jumlah Input Maksimal: " + esc);

                        System.out.print("Masukkan Jumlah Kendaraan: ");

                        // Confirm Input Access
                        int inputNew = 0;
                        do {
                            int tryIn = input.nextInt();
                            inputNew = tryIn;
                        } while (inputNew > esc);
                        
                        if (acc == 0) {
                            for (int i = 0; i < inputNew; i++) {
                                Dealer di = new Dealer();
                                di.setNamaMotor();
                                di.setBrandMotor();
                                di.setCCMotor();
                                di.setHargaMotor();
                                di.setWaktu(ad.cetakWaktu());
                                // Reintialize Arrays
                                main[i] = di;
                            }
                        } else {
                            for (int i = 0; i < inputNew; i++) {
                                Dealer di = new Dealer();
                                di.setNamaMotor();
                                di.setBrandMotor();
                                di.setCCMotor();
                                di.setHargaMotor();
                                di.setWaktu(ad.cetakWaktu());
                                // Reintialize Arrays
                                main[acc] = di;
                                acc++;
                            }
                        }

                    } else {
                        System.out.println("Maaf data sudah penuh!");
                        System.out.println("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    }

                    break;
                
                // Daftar Motor
                case 2:
                // Clear terminal
                System.out.print("\033\143");

                    // Restart Token
                    esc = 0;
                    acc = 0;

                        // Token Checker
                        for (int i = 0; i < main.length; i++) {
                            if (main[i].getHarga() == 0) {
                                esc++;
                            } else {
                                acc++;
                            }
                        }

                        System.out.println(" Nama " + " Brand " + "CC " + " Harga " + " Tanggal Input");
                        for (int i = 0; i < acc; i++) {
                            System.out.println((i + 1) + ". " + main[i].getNama() + "  " + main[i].getBrand() + "  " + main[i].getCC() + "  " + main[i].getHarga() + " " + main[i].getWaktu());
                        } 

                    System.out.print("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();

                    break;

                // Komparasi
                case 3:
                // Clear terminal
                System.out.print("\033\143");

                // Restart Token
                esc = 0;
                acc = 0;

                    // Token Checker
                    for (int i = 0; i < main.length; i++) {
                        if (main[i].getHarga() == 0) {
                            esc++;
                        } else {
                            acc++;
                        }
                    }

                    System.out.println(" Nama " + " Brand " + "CC " + " Harga " + " Tanggal Input");
                    for (int i = 0; i < acc; i++) {
                        System.out.println((i + 1) + ". " + main[i].getNama() + "  " + main[i].getBrand() + "  " + main[i].getCC() + "  " + main[i].getHarga() + " " + main[i].getWaktu());
                    } 

                    System.out.print("Pilih motor pertama: ");
                    // Confirm Input Access
                    int inputOne = 0;
                    do {
                        int tryIn = input.nextInt();
                        inputOne = tryIn;
                    } while (inputOne > acc);

                    System.out.print("Pilih motor kedua: ");
                    // Confirm Input Access
                    int inputTwo = 0;
                    do {
                        int tryIn = input.nextInt();
                        inputTwo = tryIn;
                    } while (inputTwo > acc || inputTwo == inputOne);

                    System.out.println(" Nama " + " Brand " + "CC " + " Harga " + " Tanggal Input");
                    int num = 1;
                    for (int i = 0; i < acc; i++) {
                        if (i == (inputOne-1) || i == (inputTwo-1)) {
                            System.out.println((num) + ". " + main[i].getNama() + "  " + main[i].getBrand() + "  " + main[i].getCC() + "  " + main[i].getHarga());
                            num++;
                        }
                    } 

                    System.out.print("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();

                    break;

                // Ubah Data
                case 4:
                // Clear terminal
                System.out.print("\033\143");

                // Restart Token
                esc = 0;
                acc = 0;

                    // Token Checker
                    for (int i = 0; i < main.length; i++) {
                        if (main[i].getHarga() == 0) {
                            esc++;
                        } else {
                            acc++;
                        }
                    }

                    System.out.println(" Nama " + " Brand " + "CC " + " Harga " + " Tanggal Input");
                    for (int i = 0; i < acc; i++) {
                        System.out.println((i + 1) + ". " + main[i].getNama() + "  " + main[i].getBrand() + "  " + main[i].getCC() + "  " + main[i].getHarga() + " " + main[i].getWaktu());
                    } 

                    System.out.print("Pilih nomor yang mau diubah: ");
                    // Confirm Input Access
                    int inputNew = 0;
                    do {
                        int tryIn = input.nextInt();
                        inputNew = tryIn;
                    } while (inputNew > acc);
                    
                    Dealer nw = new Dealer();
                    nw.setNamaMotor();
                    nw.setBrandMotor();
                    nw.setCCMotor();
                    nw.setHargaMotor();
                    nw.setWaktu(ad.cetakWaktu());
                    main[inputNew-1] = nw;

                    // Clear terminal
                    System.out.print("\033\143");
                    System.out.println("Data Berhasil Diubah: ");
                    System.out.print("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();

                    break;

                case 5:
                    // Clear terminal
                    System.out.print("\033\143");
                    Perusahaan pe = new Perusahaan();

                    System.out.println("Dealer Nico Super Bike");
                    pe.lokasi();
                    pe.telepon();
                    pe.pemilik();

                    System.out.print("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();

                    break;

                case 6:
                    back = 0;
                    // Clear terminal
                    System.out.print("\033\143");
                    break;
            
                default:
                // Clear terminal
                System.out.print("\033\143");
                    break;
            }     

        } while (back == 1);

        input.close();

    }
}
