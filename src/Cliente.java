import java.util.ArrayList;
import java.util.List;

// sujeto concreto
public class Cliente extends Subject{

    private List<Pedido> pedidos = new ArrayList<>();

    public void addOrder(List<Pedido> order){

        for (Pedido pedido: order) {
            pedidos.add(pedido);
        }

        System.out.println("New order added");

        this.notifiy();
    }

    public List<Pedido> getOrder() {
        return pedidos;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.pedidos));
    }

    public void removeByName(String name){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof Mesero && ((Mesero) observer).getName().equals(name))
                .findFirst()
                .get());
    }

}
