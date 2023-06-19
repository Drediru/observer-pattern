import java.util.List;

public class Mesero implements Observer{
    private String name;


    public Mesero(String name) {
        this.name = name;
    }

    @Override
    public void update(List<Pedido> pedidos) {
        System.out.println(name + ": New order has been published, serve: " );
        for (Pedido pedido: pedidos) {
            System.out.println("Mesa: " + pedido.getMesa());
            System.out.println("Producto: " + pedido.getProducto() + " Cantidad: " + pedido.getCantidad());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mesero{" +
                "nombre='" + name + '\'' +
                '}';
    }
}
