import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Pedido pedido = new Pedido("Alexis Tituaña", "PC", 1000, "Alex@gmail.com");
        PedidoService pedidoService = new PedidoService();
        pedidoService.realizar(pedido);
        pedido = null; // el obj se vuelve elegible para el garbage collector
        pedidoService = null;
        
    }
}
