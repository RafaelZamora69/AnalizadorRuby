import java.util.HashMap;

public class puts {
    public static HashMap<String, Object> variables = tokenAsignaciones.obtenerHashMap();
    public static void puts(Token t1){
        System.out.println(variables.get(t1.image));
    }
}
