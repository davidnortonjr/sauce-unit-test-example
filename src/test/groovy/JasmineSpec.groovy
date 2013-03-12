import spock.lang.*
import geb.*
import geb.spock.*

class JasmineSpec extends GebReportingSpec {

    def "all Jasmine specs should pass"() {
        when:
        go '/SpecRunner.html'
        
        then:
        title == 'Jasmine Spec Runner'
        $('.passingAlert')
    }

}