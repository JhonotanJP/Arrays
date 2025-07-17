public class Principal {
    public static void main(String[] args) {
        

        Cliente cliente1 = new Cliente("Juan","1997",19);
        Cliente cliente2 = new Cliente("Ana","1801",18);
        Cliente cliente3 = new Cliente("Jose","1803",20);
        cliente1.ImprimirDatosCliente();

        cliente1.setCedula("1704");
        cliente1.ImprimirDatosCliente();
    
    }
    }
    