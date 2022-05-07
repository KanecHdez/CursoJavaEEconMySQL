
package principal.arraylist;

import clases.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
public class SetCollection {
    public static void ejemploSet(){
         Agenda per1 = new Agenda("37", "Juan", "4921301445");
         Agenda per2 = new Agenda("30", "Araceli", "4931351645");
         Agenda per3 = new Agenda("35", "Octavio", "4921401645");
         Agenda per4 = new Agenda("28", "Mayra", "4911301545");
         Agenda per5 = new Agenda("28", "Mayra", "4911301545");
         
         if(per4.equals(per5)){
             System.out.println("Los objetos son iguales");
             System.out.println(per4.hashCode());
             System.out.println(per5.hashCode());
         }else{
             System.out.println("Los objetos no son iguales");
             System.out.println(per4.hashCode());
             System.out.println(per5.hashCode());
         }
         
         Set<Agenda> agendaClientes = new HashSet<Agenda>();
         //hashcode, equals
         
         agendaClientes.add(per1);
         agendaClientes.add(per2);
         agendaClientes.add(per3);
         agendaClientes.add(per4);
         agendaClientes.add(per5);
         
         System.out.println("La agenda contiene el objeto 5" + agendaClientes.contains(per5) );
         System.out.println("El objeto tipo agenda esta vacio" + agendaClientes.isEmpty());
         agendaClientes.remove(per1);
         System.out.println(agendaClientes.size());
         imprimeSet(agendaClientes );
         
    }
    
    static void imprimeSet(Collection<Agenda> col ){
        for (Agenda agenda : col) {
            System.out.println(agenda.getNombre() + " " + agenda.getEdad() + " " + agenda.getTelefono());
        }
    }
}
