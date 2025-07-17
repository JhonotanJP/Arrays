public class Delito {
   
    private String provincia;
    private String delito ;
    private  boolean judicializado ;
    private String victima ;
    private double monto ;
    private int año; 
    
    public Delito(String provincia, String delito, boolean judicializado, String victima, double monto, int año) {
        this.provincia = provincia;
        this.delito = delito;
        this.judicializado = judicializado;
        this.victima = victima;
        this.monto = monto;
        this.año = año;
    }
    
    public double getMonto() {
        return monto;
    }

    public int getAño() {
        return año;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getDelito() {
        return delito;
    }
    public void setDelito(String delito) {
        this.delito = delito;
    }
    public boolean isJudicializado() {
        return judicializado;
    }
    public void setJudicializado(boolean judicializado) {
        this.judicializado = judicializado;
    }
    public String getVictima() {
        return victima;
    }
    public void setVictima(String victima) {
        this.victima = victima;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String resultado=this.provincia+"\t"+
                    this.delito+"\t"+
                    this.judicializado+"\t"+
                    this.victima+"\t" +
                    this.monto +"\t"+
                    this.año;
        return resultado ;
    }
    public String ConvertirFormatoCSV(){
        String cadena =provincia+";"+delito+";"+judicializado+";"+victima +";"+monto+";"+año;
        return cadena ;
    }

    
}
