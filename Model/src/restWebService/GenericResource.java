package restWebService;

import com.bancodebogota.cartera.singleton.SingletonServiceJDNI;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import salidas.Respuesta;

@Path("/Cartera")
public class GenericResource {
    public GenericResource() {
    }

    @GET
    @Produces("application/json")
    @Path("/Consultar")
    public Response getConsulta() throws Exception {
        Response result = null;
        System.out.println("hola metodo.");
        Respuesta resp  = SingletonServiceJDNI.getInstance().getControlador().metodoPrueba("JHON", "GENERICrESOURCE");
        result = Response.status(Response.Status.ACCEPTED).entity(resp).build();
        return result;
    }
}
