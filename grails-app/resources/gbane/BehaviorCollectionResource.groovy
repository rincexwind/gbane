package gbane

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/behavior')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class BehaviorCollectionResource {

    def behaviorResourceService

    @POST
    Response create(Behavior dto) {
        created behaviorResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok behaviorResourceService.readAll()
    }

    @Path('/{id}')
    BehaviorResource getResource(@PathParam('id') Long id) {
        new BehaviorResource(behaviorResourceService: behaviorResourceService, id:id)
    }
}
