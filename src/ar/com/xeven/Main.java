package ar.com.xeven;
/*
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 */
public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("Fugazza","Familiar");
        Pizza p2 = new Pizza("Muzza","Mediana");
        p2.servir();
        System.out.println(p2);
        p2.servir();


        Pizza p3 = new Pizza("4 quesos","Familiar");
        System.out.println(p1);
        System.out.println(p3);
        System.out.println("Pedidas: "+Pizza.getTotalPizzasPedidas());
        System.out.println("Servidas: "+Pizza.getTotalPizzasServidas());


    }
}
