package Main;

public class Persona {
    private int ID;
    private String nombre;
    private String apellido;
    private String tci;
    private String ci;
    private Vehiculo carro;
    private String dEntrada;
    private int hEntrada;
    private int mEntrada;
    private int hSalida;
    private int mSalida;
    private Lista Compras;

    public Persona(int id, String nombre, String apellido, String tci, String ci, String dEntrada, int hEntrada, int mEntrada, int hSalida, int mSalida) {
        this.ID = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tci = tci;
        this.ci = ci;
        this.carro = null;
        this.dEntrada = dEntrada;
        this.hEntrada = hEntrada;
        this.mEntrada = mEntrada;
        this.hSalida = hSalida;
        this.mSalida = mSalida;
        this.Compras = new Lista();
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTci() {
        return tci;
    }

    public String getCi() {
        return ci;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public String getDEntrada() {
        return dEntrada;
    }

    public int getHEntrada() {
        return hEntrada;
    }

    public int getHSalida() {
        return hSalida;
    }

    public int getMEntrada() {
        return mEntrada;
    }

    public int getMSalida() {
        return mSalida;
    }

    public Lista getCompras() {
        return Compras;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTci(String tci) {
        this.tci = tci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public void setDEntrada(String dEntrada) {
        this.dEntrada = dEntrada;
    }
    
    
    public void setHEntrada(int hEntrada) {
        this.hEntrada = hEntrada;
    }

    public void setHSalida(int hSalida) {
        this.hSalida = hSalida;
    }

    public void setMEntrada(int mEntrada) {
        this.mEntrada = mEntrada;
    }

    public void setMSalida(int mSalida) {
        this.mSalida = mSalida;
    }
}
