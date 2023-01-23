package cuentas;

/**
 * Clase para gestionar la operativa de las cuentas corrientes
 * @author Evelio Sánchez Juncal
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Devuelve el nombre del titular de la cuenta
 * @return Nombre del titular
 */
    public String getNombre() {
        return nombre;
    }

/**
 * Establece el nombre del titular de la cuenta
 * @param nombre Nombre del titular de la cuenta
 */    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Devuelve el código de la cuenta
 * @return Código de la cuenta
 */
    public String getCuenta() {
        return cuenta;
    }

/**
 * Establece el código de la cuenta
 * @param cuenta Código de la cuenta
 */    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

/**
 * Devuelve el saldo de la cuenta
 * @return Saldo de la cuenta
 */
    public double getSaldo() {
        return saldo;
    }
    
/**
 * Establece el nuevo saldo de la cuenta
 * @param saldo Nuevo saldo de la cuenta
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

/**
 * Devuelve el tipo de interés de la cuenta
 * @return Tipo de interés de la cuenta
 */    
    public double getTipoInterés() {
        return tipoInterés;
    }

/**
 * Establece el tipo de interés de la cuenta
 * @param tipoInterés Tipo de interés que genera la cuenta
 */    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

/**
 * Metodo constructor por defecto
 */
    public CCuenta()
    {
    }

/**
 * Metodo constructor parametrizado
 * @param nom Nombre del titular de la cuenta
 * @param cue Código de la cuenta
 * @param sal Saldo actual de la cc
 * @param tipo Tipo de cuenta (ahorro, corriente, crédito, etc.)
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

/**
 * Devuelve el saldo de la cuenta
 * @return Saldo de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }

/**
 * Contabiliza ingreso en cuenta
 * @param cantidad Indica la cantidad a ingresar
 * @throws Exception Salta error
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

/**
 * Contabiliza retirada de la cuenta
 * @param cantidad Indica la cantidad a retirar
 * @throws Exception Salta error
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
