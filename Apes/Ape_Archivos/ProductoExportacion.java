public class ProductoExportacion {
    private int id;
    private String mes;
    private int anio;
    private String pais;
    private String tipoProducto;
    private double pesoToneladas;
    private double montoMillonesDolares;

    public ProductoExportacion(int id, String mes, int anio, String pais, String tipoProducto, double pesoToneladas, double montoMillonesDolares) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.pais = pais;
        this.tipoProducto = tipoProducto;
        this.pesoToneladas = pesoToneladas;
        this.montoMillonesDolares = montoMillonesDolares;
    }

    public String getPais() {
        return pais;
    }

    public int getAnio() {
        return anio;
    }

    public double getMontoMillonesDolares() {
        return montoMillonesDolares;
    }

    @Override
    public String toString() {
        return id + "\t" + mes + "\t" + anio + "\t" + pais + "\t" + tipoProducto + "\t" + pesoToneladas + "\t" + montoMillonesDolares;
    }
}
