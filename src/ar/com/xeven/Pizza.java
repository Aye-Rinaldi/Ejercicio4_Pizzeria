package ar.com.xeven;

public class Pizza {
    //atributos de instancia
    private String tipo; //muzza, 4quesos, fugazzeta
    private String tamanio; //mediana o familiar
    private String estado; //pedida o servida
    //atributos de clase
    private static int totalPizzasPedidas;
    private static int totalPizzasServidas;

    //constructor
    public Pizza(String tipo, String tamanio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.estado = "pedida";
        Pizza.totalPizzasPedidas++;
    }

    //getters y setters
    public static int getTotalPizzasPedidas() {
        return totalPizzasPedidas;
    }

    public static int getTotalPizzasServidas() {
        return totalPizzasServidas;
    }

    //metodo servir
    public void servir(){
        if (this.estado.equals("pedida")){
            this.estado = "servida";
            Pizza.totalPizzasServidas++;
        } else {
            System.out.println("Esa pizza ya se sirvio a la mesa.");
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipo='" + tipo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
