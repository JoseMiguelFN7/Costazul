package Main;

public class Vehiculo {
    private Persona dueno;
    private String tipo;
    private String placa;
    private String color;
    private String marca;

    public Vehiculo(Persona dueno, String tipo, String placa, String color, String marca) {
        this.dueno = dueno;
        this.tipo = tipo;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
    }

    public Persona getDueno() {
        return dueno;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
