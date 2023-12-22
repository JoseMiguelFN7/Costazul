package Main;

public class AVL {
    private Nodo raiz;
    
    public AVL(){
        this.raiz=null;
    }
    
    public boolean esVacio(){
        return raiz==null;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    private int obtenerFE(Nodo nodo) { //Para obtener el Factor de Equilibrio Izquierda-Derecha.
        if (nodo == null) {
            return 0;
        }
        return nodo.getAltura(nodo.getIzq()) - nodo.getAltura(nodo.getDer());
    }
    
    private void actualizarAltura(Nodo nodo) { //Metodo para actualizar las alturas de los nodos despues de cada movimiento/rotacion
        if (nodo != null) {
            nodo.setAltura(Math.max(nodo.getAltura(nodo.getIzq()), nodo.getAltura(nodo.getDer())) + 1); //La altura seria la altura del arbol mayor entre izquierda y derecha
        }
    }
    
    private Nodo rotacionDerecha(Nodo a) { //Para balancear hacia la derecha
        Nodo b = a.getIzq();
        Nodo aux = b.getDer();

        b.setDer(a);
        a.setIzq(aux);

        actualizarAltura(a);
        actualizarAltura(b);

        return b;
    }
    
    private Nodo rotacionIzquierda(Nodo b) { //Para balancear hacia la izquierda
        Nodo a = b.getDer();
        Nodo aux = a.getIzq();

        a.setIzq(b);
        b.setDer(aux);

        actualizarAltura(b);
        actualizarAltura(a);

        return a;
    }
    
    public void insertarTienda(Tienda tienda) {
        raiz = insertarT(raiz, tienda);
    }
    
    private Nodo insertarT(Nodo nodo, Tienda tienda) {
        if (nodo == null) {
            Nodo n = new Nodo();
            n.setValorTienda(tienda);
            return n;
        }

        if (tienda.getLocal()< nodo.getValorTienda().getLocal()) { //Si es menor, va a la izquierda
            nodo.setIzq(insertarT(nodo.getIzq(), tienda));
        } else if (tienda.getLocal()> nodo.getValorTienda().getLocal()) {//Si es mayor, va a la derecha
            nodo.setDer(insertarT(nodo.getDer(), tienda));
        } else {
            return nodo; //En caso de ser duplicado, no lo ingresa
        }
        
        actualizarAltura(nodo);
        
        int FE = obtenerFE(nodo);
        
        if (FE > 1 && tienda.getLocal() < nodo.getIzq().getValorTienda().getLocal()) { //Cuando hay desequilibrio a la izquierda y la hoja esta a la izquierda
            return rotacionDerecha(nodo);
        }

        if (FE < -1 && tienda.getLocal() > nodo.getDer().getValorTienda().getLocal()) { //Cuando hay desequilibrio a la derecha y la hoja esta a la derecha
            return rotacionIzquierda(nodo);
        }

        if (FE > 1 && tienda.getLocal() > nodo.getIzq().getValorTienda().getLocal()) { //Cuando hay desequilibrio a la izquierda y la hoja esta a la derecha
            nodo.setIzq(rotacionIzquierda(nodo.getIzq())); //Se rota a la izquierda
            return rotacionDerecha(nodo); //Despues a la derecha
        }

        if (FE < -1 && tienda.getLocal() < nodo.getDer().getValorTienda().getLocal()) { //Cuando hay desequilibrio a la izquierda y la hoja esta a la derecha
            nodo.setDer(rotacionDerecha(nodo.getDer())); //Se rota a la derecha
            return rotacionIzquierda(nodo); //Despues a la izquierda
        }

        return nodo;
    }
    
    private Nodo obtenerNodoMinimo(Nodo nodo) { //Metodo usado al eliminar un nodo para determinar su reemplazo
        Nodo actual = nodo;
        while (actual.getIzq() != null) { //consigue el nodo con el valor mas pequeño
            actual = actual.getIzq();
        }
        return actual;
    }
    
    public Tienda buscarTienda(int numLocal){ //Para retornar los datos de una tienda dentro del arbol
        return buscarT(raiz, numLocal);
    }
    
    private Tienda buscarT(Nodo n, int numLocal){
        if (n==null){
            return null;
        }
        if (n.getValorTienda().getLocal() == numLocal){
            return n.getValorTienda();
        }
        if (numLocal > n.getValorTienda().getLocal()){
            return buscarT(n.getDer(), numLocal);
        } else{
            return buscarT(n.getIzq(), numLocal);
        }
    }
    
    public void insertarPersona(Persona persona) { //Para insertar una persona dentro del arbol, funciona igual que las tiendas.
        raiz = insertarP(raiz, persona);
    }
    
    private Nodo insertarP(Nodo nodo, Persona persona) {
        if (nodo == null) {
            Nodo n = new Nodo();
            n.setValorPersona(persona);
            return n;
        }

        if (persona.getID()< nodo.getValorPersona().getID()) {
            nodo.setIzq(insertarP(nodo.getIzq(), persona));
        } else if (persona.getID()> nodo.getValorPersona().getID()) {
            nodo.setDer(insertarP(nodo.getDer(), persona));
        } else {
            return nodo;
        }

        actualizarAltura(nodo);

        int FE = obtenerFE(nodo);

        if (FE > 1 && persona.getID() < nodo.getIzq().getValorPersona().getID()) {
            return rotacionDerecha(nodo);
        }

        if (FE < -1 && persona.getID() > nodo.getDer().getValorPersona().getID()) {
            return rotacionIzquierda(nodo);
        }

        if (FE > 1 && persona.getID() > nodo.getIzq().getValorPersona().getID()) {
            nodo.setIzq(rotacionIzquierda(nodo.getIzq()));
            return rotacionDerecha(nodo);
        }

        if (FE < -1 && persona.getID() < nodo.getDer().getValorPersona().getID()) {
            nodo.setDer(rotacionDerecha(nodo.getDer()));
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }
    
    public void eliminarPersona(Persona persona) { //Para eliminar una persona del arbol
        raiz = eliminarP(raiz, persona);
    }

    private Nodo eliminarP(Nodo nodo, Persona persona) {
        if (nodo == null) {
            return null;
        }

        if (persona.getID() < nodo.getValorPersona().getID()) {
            nodo.setIzq(eliminarP(nodo.getIzq(), persona));
        } else if (persona.getID() > nodo.getValorPersona().getID()) {
            nodo.setDer(eliminarP(nodo.getDer(), persona));
        } else {
            // Nodo con un solo hijo o sin hijos
            if ((nodo.getIzq() == null) || (nodo.getDer() == null)) {
                
                Nodo temp = null;
                if (temp == nodo.getIzq()) {
                    temp = nodo.getDer();
                } else {
                    temp = nodo.getIzq();
                }

                //Sin hijos
                if (temp == null) {

                    nodo = null;
                    
                } else { //Un hijo
                    nodo = temp; // Copiar el contenido del hijo no nulo
                }
            } else {
                // Nodo con dos hijos: obtener menor en el subárbol derecho)
                Nodo temp = obtenerNodoMinimo(nodo.getDer());

                // Copiar los datos del sucesor al nodo actual
                nodo.setValorPersona(temp.getValorPersona());

                // Eliminar el sucesor en su posicion original
                nodo.setDer(eliminarP(nodo.getDer(), temp.getValorPersona()));
            }
        }
        // Si el árbol tenía solo un nodo, entonces retornar
        if (nodo == null) {
            return null;
        }

        actualizarAltura(nodo);

        int FE = obtenerFE(nodo);
        //Rotaciones de ser necesario, misma logica que en la insersion.
        if (FE > 1 && obtenerFE(nodo.getIzq()) >= 0) {
            return rotacionDerecha(nodo);
        }

        if (FE < -1 && obtenerFE(nodo.getDer()) <= 0) {
            return rotacionIzquierda(nodo);
        }

        if (FE > 1 && obtenerFE(nodo.getIzq()) < 0) {
            nodo.setIzq(rotacionIzquierda(nodo.getIzq()));
            return rotacionDerecha(nodo);
        }

        if (FE < -1 && obtenerFE(nodo.getIzq()) > 0) {
            nodo.setDer(rotacionDerecha(nodo.getDer()));
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }
    
    public String obtenerDatosPersonas(){ //Para obtener los datos en una string de todas las personas en el arbol.
        return rPreOrdenP(raiz);
    }
    
    private String rPreOrdenP(Nodo n){
        String s="";
        if(n!=null){
            String persona = n.getValorPersona().getID() + "_" + n.getValorPersona().getNombre() + "_" + n.getValorPersona().getApellido() + "_" + n.getValorPersona().getTci() + "_" + n.getValorPersona().getCi() + "_" + n.getValorPersona().getDEntrada() + "_" + n.getValorPersona().getHEntrada() + "_" + n.getValorPersona().getMEntrada() + "_" + n.getValorPersona().getHSalida() + "_" + n.getValorPersona().getMSalida();
            String carro;
            if (n.getValorPersona().getCarro()==null){
                carro = "no";
            } else{
                carro = n.getValorPersona().getCarro().getTipo() + "/" + n.getValorPersona().getCarro().getPlaca() + "/" + n.getValorPersona().getCarro().getColor() + "/" + n.getValorPersona().getCarro().getMarca();
            }
            String compras;
            if (n.getValorPersona().getCompras().esVacia()){
                compras = "no\n";
            } else{
                compras = n.getValorPersona().getCompras().datosCompras() + "\n";
            }
            return s += persona + "_" + carro + "_" + compras + rPreOrdenP(n.getIzq()) + rPreOrdenP(n.getDer());
        } else{
            return s;
        }
    }
    
    public void buscarPorCI(String cedula){ //Buscar personas en arbol con esa cedula
        buscarPCI(raiz, cedula);
    }
    private void buscarPCI(Nodo n, String cedula){
        if (n==null){
            return;
        }
        String CIActual = n.getValorPersona().getTci()+n.getValorPersona().getCi();
        if (cedula.equals(CIActual)){
            menuEditar.coincidencias.agregarPersonaEnLaPila(n.getValorPersona());
        }
        buscarPCI(n.getDer(), cedula);
        buscarPCI(n.getIzq(), cedula);
    }
    
    public void buscarPorNombre(String nombre){ //Buscar personas en arbol con ese nombre
        buscarPN(raiz, nombre);
    }
    private void buscarPN(Nodo n, String nombre){
        if (n==null){
            return;
        }
        String nombreActual = n.getValorPersona().getNombre() + " " + n.getValorPersona().getApellido();
        if (nombre.equals(nombreActual)){
            menuEditar.coincidencias.agregarPersonaEnLaPila(n.getValorPersona());
        }
        buscarPN(n.getDer(), nombre);
        buscarPN(n.getIzq(), nombre);
    }
}