import java.util.ArrayList;
import java.util.HashMap;

public class KomputerApp {
    public static void main(String[] args) {
        try {
            ArrayList<Komputer> daftarKomputer = new ArrayList<>();
            daftarKomputer.add(new Komputer("K001", "ASUS", "Intel i5", 8));
            daftarKomputer.add(new Komputer("K002", "Lenovo", "AMD Ryzen 5", 16));
            daftarKomputer.add(new Komputer("K003", "Dell", "Intel i7", 3)); // error RAM

            HashMap<String, Komputer> mapKomputer = new HashMap<>();
            for (Komputer k : daftarKomputer) {
                mapKomputer.put(k.getId(), k);
            }

            System.out.println("=== Daftar Komputer ===");
            for (Komputer k : daftarKomputer) {
                System.out.println(k);
            }

            System.out.println("\nAkses Komputer ID K002:");
            System.out.println(mapKomputer.get("K002"));

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("\nProgram selesai dijalankan.");
        }
    }
}
