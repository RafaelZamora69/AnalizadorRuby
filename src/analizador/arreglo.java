import java.util.ArrayList;
import java.util.HashMap;

public class arreglo {
    static HashMap<String,Object> variables = tokenAsignaciones.obtenerHashMap();

    public static void valorArreglo(Object t1, Object t2){
        Object array = variables.get(t1);
        if(array instanceof ArrayList){
            try{
                if(t2 instanceof Integer){
                    System.out.println(((ArrayList<?>) array).get((Integer)t2));
                } else if(variables.get(t2) != null){
                    System.out.println(((ArrayList<?>) array).get((Integer)variables.get(t2)));
                }
            }catch(Exception e){
                System.out.println("Error, indice no valido");
                return;
            }
        } else {
            if(array == null){
                System.out.println("Error: \"" + t1 + "\" no existe");
                return;
            }
            System.out.println("Error \"" + t1 + "\" no es un arreglo");
            return;
        }
    }
}
