import java.util.HashMap;

public class comparacion {

    public static void CompararEnteros(Object t1, Object t2, String operador){
        try{
            t1 = Integer.parseInt((String)t1);
            t2 = Integer.parseInt((String)t2);
        }catch(Exception e){
            System.out.println("Error: \"" + (String)t1 + "\" no puede ser comparado con Integer");
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

    public static void CompararCadenas(Object t1, String t2, String operador){
        if(t1 instanceof String){
            switch (operador) {
                case "<":
                    System.out.println(((String) t1).length() < t2.length());
                    break;
                case "<=":
                    System.out.println(((String) t1).length() <= t2.length());
                    break;
                case ">":
                    System.out.println(((String) t1).length() > t2.length());
                    break;
                case ">=":
                    System.out.println(((String) t1).length() >= t2.length());
                    break;
                case "==":
                    System.out.println("\"" + t1 + "\" == \"" + t2 + "\" = " +(t1.equals(t2)));
                    break;
            }
            return;
        }
        if(t1 instanceof Integer){
            switch (operador){
                case "<":
                    System.out.println((Integer)t1 < t2.length());
                    break;
                case "<=":
                    System.out.println((Integer)t1 <= t2.length());
                    break;
                case ">":
                    System.out.println((Integer)t1 > t2.length());
                    break;
                case ">=":
                    System.out.println((Integer)t1 >= t2.length());
                    break;
                case "==":
                    System.out.println("Error: operacion == invalida");
                    break;
            }
            return;
        }
        System.out.println("Error: \"" + t1 + "\" no es comparable con \"" + t2 + "\"" );
    }

    public static void CompararAsignacion(Object t1, String t2, String operador){
        //TODO: Cambiar arreglo, debe de guardarse como ArrayList.
        HashMap<String,Object> variables = tokenAsignaciones.obtenerHashMap();
        if(variables.get(t2) != null){
            Object variable = variables.get(t2);
            System.out.println(variable.getClass());
            if(variable instanceof Integer){
                CompararEnteros(t1, (Integer)variable, operador);
                return;
            }
            if(variable instanceof StringBuilder){
                CompararCadenas((String)t1, variable.toString(), operador);
                return;
            }
            if(variable instanceof Boolean){
                CompararBoolean((String)t1, variable.toString(), operador);
                return;
            }
            System.out.println("Error: '" + t2 + "' no es comparable");
        } else {
            System.out.println("Error: \"" + t2 + " no existe");
        }
        variables.get(t2);
    }

    public static void CompararBoolean(Object t1, Object t2, String operador){
        if((!t1.equals("true") || !t1.equals("false")) && (!t2.equals("true") || !t2.equals("false"))){
            System.out.println("Error: \"" + (String)t1 + "\" no puede ser comparado con Boolean");
            return;
        } else {
            if(operador.equals("==") || operador.equals("!=")){
                System.out.println(operador.equals("==") == (t1 == t2));
            } else {
                System.out.println("Error: " + operador + " no es un operador valido");
            }
        }
    }
}