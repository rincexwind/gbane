package gbane

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.PUT
import javax.ws.rs.core.Response

import org.grails.jaxrs.provider.DomainObjectNotFoundException

@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class BehaviorResource {

    def behaviorResourceService
    def id

    @GET
    Response read() {
        ok behaviorResourceService.read(id)
    }

    @PUT
    Response update(Behavior dto) {
        dto.id = id
        ok behaviorResourceService.update(dto)
    }

    @DELETE
    void delete() {
        behaviorResourceService.delete(id)
    }
}
