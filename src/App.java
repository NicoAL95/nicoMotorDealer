import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Escaper
        int esc = 0;
        int acc = 0;
        int back = 1;

        // Arrays
        Dealer [] main = new Dealer[10];

        // Fill Array Main Harga to 0
        for (int i = 0; i < main.length; i++) {
            Dealer temp = new Dealer();
            temp.setFirstStart();
            main[i] = temp;
        }
    
        Scanner input = new Scanner(System.in);

        

        do {

            System.out.println("Program Input Data Dealer Motor: ");
            System.out.println("1.Masukkan Data\n2. Cek Daftar\n3. Komparasi Kendaraan\n4. Hapus Data Kendaraan");

            System.out.print("Pilihan Anda: ");
            int inputUser = input.nextInt();
            System.out.println("Input User:  " + inputUser);
            switch (inputUser) {
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

                    if (esc < 11) {

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
                                di.setHargaMotor();
                                // Reintialize Arrays
                                main[i] = di;
                            }
                        } else {
                            for (int i = acc; i < inputNew; i++) {
                                Dealer di = new Dealer();
                                di.setNamaMotor();
                                di.setHargaMotor();
                                // Reintialize Arrays
                                main[i] = di;
                            }
                        }

                    } else {
                        System.out.print("Maaf data sudah penuh!");
                    }

                    break;

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

                    for (int i = 0; i < acc; i++) {
                        System.out.println("Nama motor : " + main[i].getNama() + " Harga motor : " + main[i].getHarga());
                    }   
                    
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
