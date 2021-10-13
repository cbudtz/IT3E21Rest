package rest;

import dto.Patient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ahoy")
public class AhoyService {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Patient getAhoy(){
        Patient patient = new Patient();
        patient.setCpr("123456-xxxx");
        patient.setName("Brian");
        return patient;
    }
}
