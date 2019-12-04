package org.gradiant.apps.codingdojos.controller.health_check;

import org.junit.jupiter.api.Test;
import org.gradiant.apps.codingdojos.controller.RequestTestCase;

final class HealthCheckGetControllerShould extends RequestTestCase {
    @Test
    void check_the_app_is_working_ok() throws Exception {
        this.assertResponse("/health-check", 200, "{'status': 'ok'}");
    }
}
