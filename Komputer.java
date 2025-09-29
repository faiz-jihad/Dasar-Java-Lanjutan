public class Komputer {
    private String id;
    private String merek;
    private String prosesor;
    private int ram;

    public Komputer(String id, String merek, String prosesor, int ram) throws Exception {
        if (ram <= 0) {
            throw new Exception("RAM harus lebih dari 0 GB");
        }
        this.id = id;
        this.merek = merek;
        this.prosesor = prosesor;
        this.ram = ram;
    }

    public String getId() { return id; }
    public String getMerek() { return merek; }
    public String getProsesor() { return prosesor; }
    public int getRam() { return ram; }

    @Override
    public String toString() {
        return id + " - " + merek + " | " + prosesor + " | " + ram + "GB RAM";
    }
}
