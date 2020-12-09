public class EjemploSopaipillas {
    public static void main(String[] args) {
        VendedorSopaipillas miVendedor=new VendedorSopaipillas();
        System.out.println(miVendedor.getNombre()+"\n"+miVendedor.getPrecio());
        miVendedor.comprar(251);

    }
}
