package hu.agridorn.mediaorder.resources;

import hu.agridorn.mediaorder.service.MediaFetchService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/medias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MediaResource {

    @Inject
    MediaFetchService mediaFetchService;

    @GET
    public Response getMedias() {
        return Response.ok(mediaFetchService.findAll()).build();
    }
}
