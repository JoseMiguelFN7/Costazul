package Main;

public class Tienda {
    private String nombre;
    private String encargado;
    private String ubicacion;
    private int local;
    private Lista productos;

    public Tienda(String nombre, String encargado, String ubicacion, int local, String productos) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.ubicacion = ubicacion;
        this.local = local;
        this.productos = new Lista();
        
        String[] arrayProductos = productos.split("-"); //Para cargar la lista de productos del archivo
        for (String datosProducto : arrayProductos) {
            String[] datProd = datosProducto.split("/");
            Producto p = new Producto(datProd[0], datProd[1], Double.parseDouble(datProd[2]));
            this.productos.agregarProductoAlFinal(p);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEncargado() {
        return encargado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getLocal() {
        return local;
    }

    public Lista getProductos() {
        return productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setLocal(int local) {
        this.local = local;
    }
}
