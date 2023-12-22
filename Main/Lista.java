package Main;

public class Lista {
    private Nodo inicio;
    private int tamanio;
    
    public Lista(){
        this.inicio=null;
        this.tamanio=0;
    }

    public Nodo getInicio() {
        return inicio;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public boolean esVacia(){
        return inicio==null;
    }
    
    
    public void agregarPersonaAlFinal(Persona p){ //metodo para agregar una persona al final de la lista
        Nodo nuevo = new Nodo();
        nuevo.setValorPersona(p);
        if(esVacia()){
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while (aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    public void eliminarPersona(Persona p){ //metodo para eliminar una persona de la lista.
        if(!esVacia()){
            if(inicio.getValorPersona().getID()==p.getID()){
                inicio = inicio.getSiguiente();
            } else{
                Nodo aux = inicio;
                while(aux.getSiguiente()!=null){
                    if(aux.getSiguiente().getValorPersona().getID()==p.getID()){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        return;
                    }
                    aux = aux.getSiguiente();
                }
            }
        }
    }
    
    public boolean estaOcupado(Persona nuevo){ //Metodo para determinar si un puesto esta ocupado en las horas establecidas.
        Nodo aux = inicio;
        while (aux!=null){
            if(nuevo.getDEntrada().equals(aux.getValorPersona().getDEntrada())){ //Si es el mismo dia.
                //Primero comparamos datos de entrada:
                if (nuevo.getHEntrada()==aux.getValorPersona().getHEntrada()){ //Si las horas de entrada coinciden.
                    //CASOS MINUTOS: minutos iguales, entrada nueva entre entrada y salida vieja o entrada vieja entre entrada y salida nueva
                    if ((nuevo.getMEntrada()==aux.getValorPersona().getMEntrada()) || (nuevo.getMEntrada()>aux.getValorPersona().getMEntrada() && nuevo.getMEntrada()<aux.getValorPersona().getMSalida()) || (aux.getValorPersona().getMEntrada()>nuevo.getMEntrada() && aux.getValorPersona().getMEntrada()<nuevo.getMSalida())){
                        return true; //esta ocupado en esas horas.
                    }
                } else{
                    //CASOS HORAS: entrada nueva entre entrada y salida vieja o entrada vieja entre entrada y salida nueva
                    if((nuevo.getHEntrada()>aux.getValorPersona().getHEntrada() && nuevo.getHEntrada()<aux.getValorPersona().getHSalida()) || (aux.getValorPersona().getHEntrada()>nuevo.getHEntrada() && aux.getValorPersona().getHEntrada()<nuevo.getHSalida())){
                        return true;//esta ocupado en esas horas.
                    }
                }
                //Despues comparamos datos de salida:
                if (nuevo.getHSalida()==aux.getValorPersona().getHSalida()){ //Si las horas de salida coinciden.
                    //CASOS MINUTOS: minutos iguales, salida nueva entre entrada y salida vieja o salida vieja entre entrada y salida nueva
                    if ((nuevo.getMSalida()==aux.getValorPersona().getMSalida()) || (nuevo.getMSalida()>aux.getValorPersona().getMEntrada() && nuevo.getMSalida()<aux.getValorPersona().getMSalida()) || (aux.getValorPersona().getMSalida()>nuevo.getMEntrada() && aux.getValorPersona().getMSalida()<nuevo.getMSalida())){
                        return true; //esta ocupado en esas horas.
                    }
                } else{
                    //CASOS HORAS: salida nueva entre entrada y salida vieja o salida vieja entre entrada y salida nueva
                    if((nuevo.getHSalida()>aux.getValorPersona().getHEntrada() && nuevo.getHSalida()<aux.getValorPersona().getHSalida()) || (aux.getValorPersona().getHSalida()>nuevo.getHEntrada() && aux.getValorPersona().getHSalida()<nuevo.getHSalida())){
                        return true; //esta ocupado en esas horas.
                    }
                }
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    public String datosOcupantes(){ //Para conseguir los datos de los ocupantes de un puesto en una string
        if(esVacia()){
            return null;
        }
        String s = "";
        Nodo aux = inicio;
        while(aux!=null){
            s+= aux.getValorPersona().getID() + "/" + aux.getValorPersona().getNombre() + "/" + aux.getValorPersona().getApellido() + "/" + aux.getValorPersona().getTci() + "/" + aux.getValorPersona().getCi() + "/" + aux.getValorPersona().getDEntrada() + "/" + aux.getValorPersona().getHEntrada() + "/" + aux.getValorPersona().getMEntrada() + "/" + aux.getValorPersona().getHSalida() + "/" + aux.getValorPersona().getMSalida() + "/" + aux.getValorPersona().getCarro().getTipo() + "/" + aux.getValorPersona().getCarro().getPlaca() + "/" + aux.getValorPersona().getCarro().getColor() + "/" + aux.getValorPersona().getCarro().getMarca();
            if (aux.getSiguiente()!=null){
                s+="~";
            }
            aux = aux.getSiguiente();
        }
        return s;
    }
    
    public void agregarProductoAlFinal(Producto p){ //metodo para agregar un producto al final de la lista
        Nodo nuevo = new Nodo();
        nuevo.setValorProducto(p);
        if(esVacia()){
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while (aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    public Producto[] getArrayProductos(){ //para convertir la lista en una array
        Producto[] arrayProductos = new Producto[tamanio];
        if(esVacia()){
            return null;
        } else{
            Nodo aux = inicio;
            for (int i=0; i<tamanio; i++){
                arrayProductos[i] = aux.getValorProducto();
                aux = aux.getSiguiente();
            }
            return arrayProductos;
        }
    }
    
    public Producto buscarProducto(String nombreP){ //para buscar un producto en la lista
        if (esVacia()){
            return null;
        } else{
            Nodo aux = inicio;
            while(aux!=null){
                if(aux.getValorProducto().getNombre().equals(nombreP)){
                    return aux.getValorProducto();
                }
                aux = aux.getSiguiente();
            }
            return null;
        }
    }
    
    public void agregarCompraAlFinal(Compra c){ //para agregar una compra al final de la lista
        Nodo nuevo = new Nodo();
        nuevo.setValorCompra(c);
        if(esVacia()){
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while (aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    public void eliminarCompra(Compra c){ //para eliminar una compra de la lista
        if(!esVacia()){
            if(inicio.getValorCompra().getProducto().getNombre().equals(c.getProducto().getNombre())){
                inicio = inicio.getSiguiente();
            } else{
                Nodo aux = inicio;
                while(aux.getSiguiente()!=null){
                    if(aux.getSiguiente().getValorCompra().getProducto().getNombre().equals(c.getProducto().getNombre())){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        return;
                    }
                    aux = aux.getSiguiente();
                }
            }
        }
    }
    
    public String datosCompras(){ //para almacenar los datos de las compras de una persona en una string
        if(esVacia()){
            return "no";
        }
        String s = "";
        Nodo aux = inicio;
        while(aux!=null){
            s+= aux.getValorCompra().getTienda().getLocal() + "/" + aux.getValorCompra().getProducto().getNombre() + "/" + aux.getValorCompra().getUnidades() + "/" + aux.getValorCompra().getPrecioTotal() + "/" + aux.getValorCompra().getTipoCompra() + "/" + aux.getValorCompra().getMetodoPago();
            if (aux.getSiguiente()!=null){
                s+="-";
            }
            aux = aux.getSiguiente();
        }
        return s;
    }
    
    public boolean existeOcupante(Persona persona){ //Para determinar si la persona esta ocupando ese puesto
        if (esVacia()){
            return false;
        } else{
            Nodo aux = inicio;
            while(aux!=null){
                if(aux.getValorPersona().getID()==persona.getID()){
                    return true;
                }
                aux = aux.getSiguiente();
            }
            return false;
        }
    }
    
    public Compra[] getArrayCompras(){ //para convertir la lista de compras en una array
        if(esVacia()){
            return null;
        } else{
            Compra[] compras = new Compra[tamanio];
            Nodo aux = inicio;
            int i = 0;
            while(aux!=null){
                compras[i++] = aux.getValorCompra();
                aux = aux.getSiguiente();
            }
            return compras;
        }
    }
}