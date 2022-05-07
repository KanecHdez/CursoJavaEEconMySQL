package principal.arraylist;

import clases.Agenda;
import java.util.HashMap;
import java.util.Map;

public class MapCollectionHasMap {
    public void trabajarConMap(){
        //crear un mapa
        HashMap<String,Agenda> agenda = new HashMap<String,Agenda>();
        agenda.put("001", new Agenda("34","Juan","4921301445") );
        agenda.put("002", new Agenda("30","María","4921301400") );
        agenda.put("003", new Agenda("31","Carlos","5925306445") );
        agenda.put("004", new Agenda("32","Fatima","8921391465") );
        //imprimiendo los elementos del hashMap
        imprimeMap(agenda);
        //eliminar un elemento
        agenda.remove("002");
        imprimeMap(agenda);
        //reemplazar un elemento
        agenda.put("001",new Agenda("15","Julian","no tiene"));
        imprimeMap(agenda);
        System.out.println(agenda.keySet());
        System.out.println(agenda.get("001"));
    }
    static void imprimeMap(HashMap<String,Agenda> agenda){
       System.out.println();
       for(Map.Entry<String,Agenda> ag: agenda.entrySet() ){
           System.out.println("Clave:" + ag.getKey() + " "
                               +"Nombre:" + ag.getValue().getNombre()
                               +"Edad:" + ag.getValue().getEdad()
                               +"Telefono:" + ag.getValue().getTelefono() );
       }
    }
}
