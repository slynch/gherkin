package org.gherkin

import org.codehaus.groovy.runtime.InvokerHelper
import org.junit.Test
import static org.junit.Assert.*

class GherkinTest {

    @Test public void usingCorrectVersionOfGroovy() {
        assertEquals('1.7.0', InvokerHelper.version)
    }
    
}

