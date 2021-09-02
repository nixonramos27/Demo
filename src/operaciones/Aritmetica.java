package operaciones;

public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Eje const");
    }

    //Sobrecarga
    public Aritmetica(int a, int b){
        this.a = a;
        this.b =b;
        System.out.println("Constructor args");
    }

    //metodos
    public void sumar(){
        int result =this.a+this.b;
        System.out.println("result = " + result);
    }
    public int sumarRetorno(){
        //int result =a+b;
        //return result;
        return this.a+this.b;
    }

    public int sumarArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarRetorno();
    }
}
