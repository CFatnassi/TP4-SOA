package serveur;

import service.CalculatriceWS;

public class ServeurJWS {

	public static void main (String[]args) {
		
		//instanciation du service
		CalculatriceWS c = new CalculatriceWS();
		
		//fixation de l'url où on va publier nos services
		String url = "http://localhost:8084/";
		// à travers Endpoint.publish on va publier
		// le service dans l'url
		Endpoint.publish(url, c);
		
		System.out.println("url : "+url);
	}
}
