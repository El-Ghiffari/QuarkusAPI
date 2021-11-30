package id.co.bsi.monitoring;

import id.co.bsi.monitoring.dto.ContohRequest;
import id.co.bsi.monitoring.dto.ContohResponse;
import id.co.bsi.monitoring.dto.ContohTabelRequest;
import id.co.bsi.monitoring.dto.ContohTabelResponse;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.logging.Logger;

@Path("/monitoring")
public class MonitoringApi {
     private static final Logger log = Logger.getLogger(MonitoringApi.class);
    @Inject
    KumpulanQueryContohTabel kumpulanQueryContohTabel;

    
    
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy AAAAAAAAAAAAAAAAAAAAAAAAA";
    }
    
    @GET
    @Path("/juragan")
    public String dodol(){
        return "AAAAAAAAAABBBBBBBBBBBBBBBB";
    }
    
    @Path("/gabungNama")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ContohResponse gabungNama(ContohRequest request){
        ContohResponse response = new ContohResponse();
        response.namaLengkap = request.namaDepan+" "+request.namaBelakang;
        return response;
    }
    
    
    @Path("/gabungNamaDua")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response gabungNamaDua(ContohRequest request){
        ContohResponse response = new ContohResponse();
        response.namaLengkap = request.namaDepan+" "+request.namaBelakang;     
        
    kumpulanQueryContohTabel.getListAll();
        
        return Response.status(Response.Status.OK).entity(response).build();
    }
    
    
    @Path("/insertData")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertContohTabel(ContohTabelRequest request){
        log.info("KKKK "+request.aidi);
        kumpulanQueryContohTabel.insertDataCuy(request);
        log.info("LLLLLLLL");
        ContohTabelResponse response = new ContohTabelResponse();
        response.aidi = "AAAAAA";
        response.addres = "AAAAAA";
        response.name = "AAAAAA";
        
        return Response.status(Response.Status.OK).entity(response).build();
    }
    
    @Path("/updateData")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateContohTabel(ContohTabelRequest request){
        log.info("UUUU "+request.aidi);
        kumpulanQueryContohTabel.updateData(request);
        log.info("YYYYY");
        
        
        
        ContohTabelResponse response = new ContohTabelResponse();
        response.aidi = "AAAAAA";
        response.addres = "AAAAAA";
        response.name = "AAAAAA";
        
        return Response.status(Response.Status.OK).entity(response).build();
    }
    
    
    @Path("/deleteData")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteContohTabel(ContohTabelRequest request){
        log.info("XXXXX "+request.aidi);
        kumpulanQueryContohTabel.deleteData(request);
        log.info("NNNNNN");
        
        
        
        ContohTabelResponse response = new ContohTabelResponse();
        response.aidi = "AAAAAA";
        response.addres = "AAAAAA";
        response.name = "AAAAAA";
        
        return Response.status(Response.Status.OK).entity(response).build();
    }
    
    
    
    
}