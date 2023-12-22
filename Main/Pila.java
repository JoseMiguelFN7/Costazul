package Main;

public class Pila {
    private Nodo tope;
    private int tamanio;
    
    public void Pila(){
        this.tope=null;
        this.tamanio=0;
    }
    
    public boolean esVacia(){ //Metodo para determinar si la pila esta vacia.
        return tope==null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarPersonaEnLaPila(Persona valorPersona){ //Metodo para agregar personas a la pila.
        Nodo nuevo=new Nodo();
        nuevo.setValorPersona(valorPersona);
        if (esVacia()){
            tope=nuevo;
        }else{
            nuevo.setSiguiente(tope);
            tope=nuevo;
        }
        tamanio++;
    }
    
    public Persona sacarPersonaDePila(){ //Metodo para sacar una persona de la pila.
        Persona valorPersona=null;
        if (!esVacia()){
            valorPersona=tope.getValorPersona();
            tope=tope.getSiguiente();
            tamanio--;
        }
        return valorPersona;
    }
    
    public Persona verTope(){ //para ver el tope sin retirarlo
        if (esVacia()){
            return null;
        } else{
            return tope.getValorPersona();
        }
    }
}
