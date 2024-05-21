// package test;

// import java.util.Optional;

// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.Test;

// import main.java.com.pedidovendajava.dominio.pedidos.PedidoInput;
// import main.java.com.pedidovendajava.dominio.pedidos.PedidosHandler;

// public class PedidosHandlerTestes {
//   PedidosHandler handler;

//   @Before
//   public void setUp() throws Exception {
//     PedidosRepositoryMock repositoryMock = new PedidosRepositoryMock();
//     handler = new PedidosHandler(repositoryMock);
//   }

//   @Test
//   public void pedido_deve_ser_criado_com_sucesso() {
//     PedidoInput input = new PedidoInput();
//     Assert.assertEquals(Optional.empty(), handler.Criar(input));
//   }
// }
