/**
 * 
 * @author Germ�n Arcos
 *
 */
public class CuentaCorriente {
	/**
	 * @author Germ�n Arcos
	 */
	private String numCuenta;
	private double saldo;
	/**
	 * 
	 * @param cuenta
	 * @param cantidad
	 */
	public CuentaCorriente(String cuenta, double cantidad){
		numCuenta=cuenta;
		saldo=cantidad;
	}
	public void ingresaEfectivo (double cantidad){
		saldo+=cantidad;
	}
	/**
	 * 
	 * @param cantidad
	 * @return Devuelve un booleano, verdadero si ha conseguido realizar la operaci�n,
	 * falso si no, si consigue realizarla hace el c�lculo
	 */
	public boolean retirarEfectivo (double cantidad){
		if(saldo>=cantidad){
			saldo-=cantidad;
			return true;
		} 
		else{
			return false;
		}
	}
	public void visualiza(){
		System.out.println("El n�mero de cuenta es: "+numCuenta);
		System.out.println("El saldo es:" +saldo);
	}
}
