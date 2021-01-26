import java.util.ArrayList;
import java.util.HashMap;
public class tokenAsignaciones {
    public static HashMap<String, Object> variables = new HashMap<>();

    public static void Asignar(Token t1, Object t2){
        if(t2 instanceof Integer || t2 instanceof Boolean){
            variables.put(t1.image,t2);
        } else if(t2 instanceof String){
            StringBuilder cadena = new StringBuilder();
            cadena.append(t2);
            variables.put(t1.image,cadena);
        }
    }

    public static void AsignarVariable(Token t1, Object t2){
        if(variables.get(t2) == null){
            System.out.println("Error: " + t2.toString() + " no existe");
        } else {
            variables.put(t1.image, variables.get(t2));
        }
    }

    public static Boolean comprobarVariable(String var){
        return variables.get(var) != null ? true : false;
    }

    public static void AsignarArreglo(String identifier, ArrayList data){
        variables.put(identifier, data);
    }

    public static HashMap obtenerHashMap(){
        return variables;
    }

    public static Object obtenerValor(String variable){
        if(variables.get(variable) != null){
            return variables.get(variable);
        }
        return null;
    }
}
