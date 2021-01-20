import java.util.HashMap;

public class arreglo {
    static HashMap<String,Object> variables = tokenAsignaciones.obtenerHashMap();
    public static void valorArreglo(Object t1, Object t2){
        if(variables.get(t1) != null){
            Object value = variables.get(t1);
            if(t2 instanceof Integer){
                System.out.println(value);
            } else if(variables.get(t2) != null){
                
            }
        }
    }
}
