package gbane

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class BehaviorResourceService {

    def create(Behavior dto) {
        dto.save()
    }

    def read(id) {
        def obj = Behavior.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Behavior.class, id)
        }
        obj
    }

    def readAll() {
        Behavior.findAll()
    }

    def update(Behavior dto) {
        def obj = Behavior.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Behavior.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = Behavior.get(id)
        if (obj) {
            obj.delete()
        }
    }
}
