import java.util.Random;

public class CuentaBancaria {

    private double saldoCuentaCorriente;
    private double saldoCuentaAhorros;
    private String numeroDecuenta;
    public static int cantidadCuentas;
    public static double cantidadTotalDinero;

    public CuentaBancaria() {
        cantidadCuentas++;
        numeroDecuenta = generaNumeroDeCuenta();
    }

    public double getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }
    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }
    
    public void depositarCuentaCorriente(double monto){
        saldoCuentaCorriente += monto;
        cantidadTotalDinero+=monto;
    }
    public void depositarCuentaAhorros(double monto){
        saldoCuentaAhorros += monto;
        cantidadTotalDinero+=monto;
    }

    public boolean retirarCuentaCorriente(double monto){
        if(saldoCuentaCorriente<monto){
            System.out.println("No se puede retirar el monto especificado. Tu saldo de cuenta corriente es: "+getSaldoCuentaCorriente());
            return false;
        }
        saldoCuentaCorriente-=monto;
        cantidadTotalDinero-=monto;
        System.out.println("Retiro realizado. Tu saldo de cuenta corriente es: "+getSaldoCuentaCorriente());
        return true;
    }

    public boolean retirarCuentaAhorros(double monto){
        if(saldoCuentaAhorros<monto){
            System.out.println("No se puede retirar el monto especificado. Tu saldo de cuenta corriente es: "+getSaldoCuentaAhorros());
            return false;
        }
        saldoCuentaAhorros-=monto;
        cantidadTotalDinero-=monto;
        System.out.println("Retiro realizado. Tu saldo de cuenta corriente es: "+getSaldoCuentaAhorros());
        return true;
    }

    public String toString(){
        return "Numero de cuenta: "+numeroDecuenta+
                "\nSaldo en cuenta corriente: "+getSaldoCuentaCorriente()+
                "\nSaldo en cuenta ahorros: "+getSaldoCuentaAhorros();
    }

    private String generaNumeroDeCuenta(){
        String[] numeros = {"1","2","3","4","5","6","7","8","9","0"};

        Random random = new Random();
        
        String numeroDeCuenta = "";
        for(int i=0;i<10;i++){
            int indice = random.nextInt(numeros.length);
            numeroDeCuenta+=numeros[indice];
        }

        return numeroDeCuenta;
    }

}