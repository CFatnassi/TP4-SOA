package service;

@webService(name="CalculWS") //annotation qui indique un service web ayant le nom CalculWS
public class CalculatriceWS {
	
	@WebMethod(operationName="Somme") //annotation qui indique une methode web ayant le nom Somme
	public double somme(@webParam(name="val1") double a,@webParam(name="val2") double b) {
		// on associe un nom (val1/val2) à chaque paramètre
		return a+b;
	}
}
