class VendedorSopaipillas {
    private int precio;
    private String nombre;

    public VendedorSopaipillas() {
        this.precio = 250;
        this.nombre = "Best Sopaipas";
    }


     int vuelto(int dinero) {
        int vuelto = 0;
        if (dinero >= precio) {
            vuelto = dinero - precio;
            return vuelto;
        } else {
            return -1;
        }

    }

    void comprar(int dinero) {
        int vuelto = 0;
        if (dinero == 250) {
            System.out.println("Una sopaipilla....");
        } else {
            vuelto = vuelto(dinero);
            if (vuelto == -1) {
                System.out.println("el dinero no es suficiente...");
            } else {
                System.out.println("Su vuelto es de: $" + vuelto);
            }

        }

    }
    public String getPrecio() {
        return "El precio por unidad es: "+precio;
    }


    public String getNombre() {
        return nombre;
    }

}
