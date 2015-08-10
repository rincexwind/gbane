package gbane

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(AdminService)
class AdminServiceSpec extends Specification {

    void "static quote service always returns static quote"() {
		when:
		Behavior staticQuote = service.getStaticQuote()
		
		then:
		staticQuote.author == "Anonymouse"
	}
}
