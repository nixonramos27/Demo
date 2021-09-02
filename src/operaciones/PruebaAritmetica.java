package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //V local
        int a =10;
        int b =2;
        miMetodo();
        Aritmetica ar1 = new Aritmetica();
        System.out.println("a "+ar1.a);
        System.out.println("b "+ar1.b);
        Aritmetica ar2 = new Aritmetica(5,8);
        System.out.println("a "+ar2.a);
        System.out.println("b "+ar2.b);
        ar1.a = 2;
        ar1.b = 3;
        ar1.sumar();
        
        int result = ar1.sumarRetorno();
        System.out.println("result = " + result);

        result= ar1.sumarArgumentos(1,3);
        System.out.println("result = " + result);
        System.out.println("cabio de prueba");
        System.out.println("msg prueba 2");
    }

    public static void miMetodo(){
        System.out.println("otro metodo");
    }
}
