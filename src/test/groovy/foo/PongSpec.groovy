package foo

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PongSpec extends Specification implements DomainUnitTest<Pong> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
