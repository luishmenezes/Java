package Lista01.q10;

public class Main {
    
    public static void main(String[] args){
        Pedido p1 = new Pedido(33,"celular",3000);
        Pedido p2 = new Pedido(45,"notebook",4500);
        Pedido p3 = new Pedido(12,"teclado",150);
    
        System.out.println(p1.nPedido+p1.descricao+p1.valorTotal);
        System.out.println(p2.nPedido+p2.descricao+p2.valorTotal);
        System.out.println(p3.nPedido+p3.descricao+p3.valorTotal);
    
    }}
    
    
