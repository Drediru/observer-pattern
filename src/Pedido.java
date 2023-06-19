
public class Pedido {
    private String mesa;
    private String producto;
    private Double cantidad;

    public Pedido(String mesa, String producto, Double cantidad) {
        this.mesa = mesa;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMesa() {
        return mesa;
    }

    public String getProducto() {
        return producto;
    }

    public Double getCantidad() {
        return cantidad;
    }
}
