package ma.Atelier;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO == simple classe java
@WebService(serviceName = "banqWS")
public class BanqueService {
    @WebMethod(operationName = "CONVERSION")
    public double conversion(@WebParam(name = "MONTANT") double montant)
    {
        return montant * 10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code)
    {
        return new Compte(code, Math.random()*9988,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()*9988,new Date()),
                new Compte(2, Math.random()*9988,new Date()),
                new Compte(3, Math.random()*9988,new Date())
        );
    }

}
