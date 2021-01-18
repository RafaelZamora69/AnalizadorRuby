import java.util.ArrayList;
import java.util.HashMap;

public class puts {
    public static HashMap<String, Object> variables = tokenAsignaciones.obtenerHashMap();
    public static void imprimirVariable(Token t1){
        Object variable = variables.get(t1.image);
        if(variable != null){
            System.out.println(variable);
        } else {
            System.out.println("Error de referencia: '" + t1.image + "' no esta existe");
        }
    }

    public static void imprimir(String text){
        System.out.println(text);
    }
}
