import java.util.HashMap;

public class cicloFor {
    public static void declararIterable(Object iterable){
        tokenAsignaciones.variables.put((String)iterable,null);
    }

    public static void eliminarIterable(Object iterable){
        tokenAsignaciones.variables.remove(iterable);
    }

    public static void forNumero(int value){
        for(int i  = 0; i < value; i++){
            System.out.println(i);
            try{
                analizador.Code();
            }catch (Exception e){

            }
        }
    }
}
