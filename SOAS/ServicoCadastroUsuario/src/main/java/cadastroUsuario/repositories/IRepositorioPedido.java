package cadastroUsuario.repositories;

import cadastroUsuario.domain.restaurante.persistidas.Pedido;
import java.util.List;

public interface IRepositorioPedido {

  public List<Pedido> buscarPedidos();

  public Pedido buscarPedido(int idPedido);

  public void realizarPedido(Pedido pedido);
}
