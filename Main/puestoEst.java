package Main;

public class puestoEst {
    private String sector;
    private int numero;
    private Lista ocupantes;

    public puestoEst(String sector, int numero) {
        this.sector = sector;
        this.numero = numero;
        this.ocupantes = new Lista();
    }

    public String getSector() {
        return sector;
    }

    public int getNumero() {
        return numero;
    }

    public Lista getOcupantes() {
        return ocupantes;
    }
    
    public void agregarOcupantes(String listaOcupantes){ //Para cargar los ocupantes del archivo a la lista del puesto.
        String[] arrayOcupantes = listaOcupantes.split("~");
        for(int i=0; i<arrayOcupantes.length; i++){
            String[] oc = arrayOcupantes[i].split("/");
            Persona o = new Persona(Integer.parseInt(oc[0]), oc[1], oc[2], oc[3], oc[4], oc[5], Integer.parseInt(oc[6]), Integer.parseInt(oc[7]), Integer.parseInt(oc[8]), Integer.parseInt(oc[9]));
            o.setCarro(new Vehiculo(o, oc[10], oc[11], oc[12], oc[13]));
            ocupantes.agregarPersonaAlFinal(o);
        }
    }
    
}
