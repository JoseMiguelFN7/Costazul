package Main;

public class Compra {
    private Persona comprador;
    private Tienda tienda;
    private Producto producto;
    private int unidades;
    private double precioTotal;
    private String tipoCompra;
    private String metodoPago;

    public Compra(Persona comprador, Tienda tienda, Producto producto, int unidades, double precioTotal, String tipoCompra, String metodoPago) {
        this.comprador = comprador;
        this.tienda = tienda;
        this.producto = producto;
        this.unidades = unidades;
        this.precioTotal = precioTotal;
        this.tipoCompra = tipoCompra;
        this.metodoPago = metodoPago;
    }

    public Persona getComprador() {
        return comprador;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
}
