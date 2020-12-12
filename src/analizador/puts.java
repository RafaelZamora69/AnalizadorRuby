import java.util.HashMap;

public class puts {
    public static HashMap<String, Object> variables = tokenAsignaciones.obtenerHashMap();
    public static void imprimirVariable(Token t1){
        System.out.println(variables.get(t1.image) == null ? "Error: '" + t1.image + "' no existe" : variables.get(t1.image));
    }

    public static void imprimir(String text){
        System.out.println(text);
    }
}
