public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.depositarCuentaAhorros(2500);
        cuentaBancaria.depositarCuentaCorriente(700);
        cuentaBancaria.retirarCuentaAhorros(1000);
        cuentaBancaria.retirarCuentaAhorros(400);
        System.out.println( cuentaBancaria.toString() );

        CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
        cuentaBancaria2.depositarCuentaAhorros(500);
        cuentaBancaria2.depositarCuentaCorriente(200);
        System.out.println(cuentaBancaria2.toString());

        System.out.println("Cantidad de cuentas: "+CuentaBancaria.cantidadCuentas);
        System.out.println("Total de dinero: "+CuentaBancaria.cantidadTotalDinero);
    }
}