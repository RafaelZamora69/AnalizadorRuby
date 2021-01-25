

public class operaciones {

    public static Number opNumero(Object op1, String Operador, Object op2){
        if(op1 instanceof Float){
            return Operacion((Float)op1,Operador,(Float)op2);
        }
        if(tokenAsignaciones.obtenerValor((String)op1) != null){
            return Operacion((Float)tokenAsignaciones.obtenerValor((String)op1),Operador,(Float)op2);
        } else {
            System.out.println("Error: \"" + op1 +"\" no existe");
        }
        return null;
    }

    public static Number opVariable(Object op1, String Operador, Object op2){
        if(op1 instanceof Float){
            if(tokenAsignaciones.obtenerValor((String)op2) != null){
                return Operacion((Float)op1,Operador,(Float)tokenAsignaciones.obtenerValor((String)op2));
            } else {
                System.out.println("Error: \"" + op2 +"\" no existe");
                return null;
            }
        }
        if(tokenAsignaciones.obtenerValor((String)op1) != null){
            if(tokenAsignaciones.obtenerValor((String)op2) != null){
                return Operacion((Float)tokenAsignaciones.obtenerValor((String)op1),Operador,(Float)tokenAsignaciones.obtenerValor((String)op2));
            } else {
                System.out.println("Error: \"" + op2 +"\" no existe");
                return null;
            }
        } else {
            System.out.println("Error: \"" + op1 +"\" no existe");
        }
        return null;
    }

    static Number Operacion(Float op1,String operador,Float op2){
        switch(operador){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
        }
        return null;
    }
}