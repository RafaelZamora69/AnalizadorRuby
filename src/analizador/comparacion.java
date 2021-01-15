import java.util.HashMap;

public class comparacion {

    public static void CompararEnteros(Object t1, Object t2, String operador){
        //Intentar convertir Objetos a enteros
        try{
            t1 = Integer.parseInt((String)t1);
            t2 = Integer.parseInt((String)t2);
        }catch(Exception e){
            System.out.println("Error semántico: \"" + (String)t1 + "\" no puede ser comparado con Integer");
            return;
        }
        switch (operador) {
            case "<":
                System.out.println((int)t1 < (int)t2 ? true : false);   
                break;
            case "<=":
                System.out.println((int)t1 <= (int)t2 ? true : false);
                break;
            case ">":
                System.out.println((int)t1 > (int)t2 ? true : false);
                break;
            case ">=":
                System.out.println((int)t1 >= (int)t2 ? true : false);
                break;
            case "==":
                System.out.println((int)t1 == (int)t2 ? true : false);
                break;
        }
    }

    public static void CompararCadenas(String t1, String t2, String operador){
        switch (operador) {
            case "<":
                System.out.println(t1.length() < t2.length() ? true : false);
                break;
            case "<=":
                System.out.println(t1.length() <= t2.length() ? true : false);
                break;
            case ">":
                System.out.println(t1.length() > t2.length() ? true : false);
                break;
            case ">=":
                System.out.println(t1.length() >= t2.length() ? true : false);
                break;
            case "==":
                System.out.println("\"" + t1 + "\" == \"" + t2 + "\" = " +(t1.equals(t2) ? true : false));
                break;
        }
    }

    public static void CompararAsignacion(Object t1, String t2, String operador){
        //TODO: Cambiar arreglo, debe de guardarse como ArrayList. Comparar booleanos
        HashMap<String,Object> variables = tokenAsignaciones.obtenerHashMap();
        if(variables.get(t2) != null){
            Object variable = variables.get(t2);
            System.out.println(variable);
            if(variable instanceof Integer){
                CompararEnteros(t1, (Integer)variable, operador);
                return;
            }
            if(variable instanceof StringBuilder){
                CompararCadenas((String)t1, variable.toString(), operador);
            }
        } else {
            System.out.println("Error: \"" + t2 + " no existe");
        }
        variables.get(t2);
    }
}