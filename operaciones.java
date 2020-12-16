import java.util.HashMap;

public class operaciones {
    

    public static void operaciones(Token x, Token operador, Token y){
		if(operador.image == "+"){
			System.out.println("El resultado de la suma  es: "+ (Integer.parseInt(x.image)+Integer.parseInt(y.image)));
		}
		if(operador.image == "-"){
			System.out.println("El resultado de la resta  es: "+ (Integer.parseInt(x.image)-Integer.parseInt(y.image)));
		}
		if(operador.image == "*"){
			System.out.println("El resultado de la multiplicación  es: "+ (Integer.parseInt(x.image)*Integer.parseInt(y.image)));
		}
		if(operador.image == "/"){
			System.out.println("El resultado de la división  es: "+ (Integer.parseInt(x.image)/Integer.parseInt(y.image)));
		}
    }
}
//System.out.println(variables.get(operador.image) == '+' ? "El resultado de la suma es: "+ x+y:
//		System.out.println(variables.get(operador.image) == '-' ? "El resultado de la resta es: "+ x-y:
//		System.out.println(variables.get(operador.image) == '*' ? "El resultado de la multiplicación es: "+ x*y:
//		System.out.println(variables.get(operador.image) == '/' ? "El resultado de la división es: "+ x/y:
/*public static HashMap<String, Object> variables = tokenAsignaciones.obtenerHashMap();
    public static void imprimirOperacion(Token t1, Token t2, Token t3){
        System.out.println(variables.get(t1.image) == null ? "Error: '" + t1.image + "' no existe" : variables.get(t1.image));
		System.out.println(variables.get(t2.image) == null ? "Error: '" + t1.image + "' no existe" : variables.get(t2.image));
		System.out.println(variables.get(t3.image) == null ? "Error: '" + t1.image + "' no existe" : variables.get(t3.image));
    }*/