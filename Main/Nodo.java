package Main;

public class Nodo {
    private Persona valorPersona;
    private Producto valorProducto;
    private Tienda valorTienda;
    private Compra valorCompra;
    private Nodo siguiente, der, izq;
    private int altura;
    
    public Nodo(){
        this.valorPersona=null;
        this.valorProducto=null;
        this.valorCompra=null;
        this.siguiente=null;
        this.der=null;
        this.izq=null;
        this.altura=1;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public void setValorPersona(Persona valorPersona) {
        this.valorPersona = valorPersona;
    }

    public void setValorProducto(Producto valorProducto) {
        this.valorProducto = valorProducto;
    }

    public void setValorTienda(Tienda valorTienda) {
        this.valorTienda = valorTienda;
    }

    public void setValorCompra(Compra valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Persona getValorPersona() {
        return valorPersona;
    }

    public Producto getValorProducto() {
        return valorProducto;
    }

    public Tienda getValorTienda() {
        return valorTienda;
    }

    public Compra getValorCompra() {
        return valorCompra;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getDer() {
        return der;
    }

    public Nodo getIzq() {
        return izq;
    }
    
    public int getAltura(Nodo nodo){
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }
    
    public void setAltura(int altura){
        this.altura=altura;
    }
}
