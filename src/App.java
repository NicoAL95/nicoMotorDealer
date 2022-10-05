public class App {
    public static void main(String[] args) {
        Sport sp = new Sport();

        System.out.println("Aplikasi Penjual Motor Gede | Nico Abel Laia - TI Matana 2021");
        System.out.println("Brand   : " + sp.bikeBrand);
        System.out.println("Type    : " + sp.getBikeType());
        System.out.println("Name    : " + sp.getBikeName());
        System.out.println("Series  : " + sp.getBikeSeries());
        System.out.println("CC      : " + sp.getBikeCc());
        System.out.println("Power   : " + sp.getBikePower());
        System.out.println("Torque  : " + sp.getBikeTorque());

    }
}
