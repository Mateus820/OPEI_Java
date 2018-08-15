public class Calculadora {


    public float Somar(float a, float b){
        return a + b;
    }
    public float Subtrair(float a, float b){
        return a - b;
    }
    public float Dividir(float a, float b){
        return a / b;
    }
    public float Multiplicar(float a, float b){
        return a * b;
    }

    //Fazer;
    public float Potencializar(float a, int b){
        float result = 1;
    
        for (int i = 0; i < b; i++) result *= a;
            return result;
    }
    public float Racionalizar(){
        return 1;
    }
}
