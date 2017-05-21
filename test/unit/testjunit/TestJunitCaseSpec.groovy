package testjunit



import com.testjunit.TestJunitCase
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TestJunitCaseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
	
	
	def "should return 2 from getTestList "() {
		given:
		List<Integer> list = new ArrayList<>();
		list.add(2);
		when:
		TestJunitCase testJunitCase = new TestJunitCase()
		int val = testJunitCase.getUserList()
		then:
		2 == val
		}
}
