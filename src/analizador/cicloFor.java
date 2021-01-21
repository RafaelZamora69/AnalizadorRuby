import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class cicloFor {

    public static void declararIterador(Object iterador){
        tokenAsignaciones.variables.put((String)iterador,null);
    }

    public static void eliminarIterador(Object iterador){
        tokenAsignaciones.variables.remove(iterador);
    }

    public static void forNumero(Object iterador, Integer iterable){
        System.out.println(iterador + " recorrera de [ 0 - " + iterable + " ]");
    }

    public static void forString(Object iterador, StringBuilder iterable){
        System.out.println(iterador + " recorrera el contenido de \"" + iterable.toString() + "\"");
    }

    public static void forArray(Object iterador, ArrayList iterable){
        System.out.println(iterador + " recorrera el contenido de " + iterable.toString());
    }

    public static void forVariable(Object iterador, Object iterable){
        Object value = tokenAsignaciones.variables.get(iterable);
        if( value != null){
            if(value instanceof ArrayList){
                forArray(iterador, (ArrayList) value);
                return;
            }
            if(value instanceof StringBuilder){
                forString(iterador, (StringBuilder) value);
                return;
            }
            if(value instanceof Integer){
                forNumero(iterable, (Integer) value);
                return;
            }
            System.out.println("Error \"" + iterable.getClass() + "\n no es un objeto iterable");
        } else {
            System.out.println("Error \"" + iterable +"\" no existe");
        }
    }
}