package org.gradiant.apps.codingdojos.controller.katas;

import org.junit.jupiter.api.Test;
import org.gradiant.apps.codingdojos.controller.RequestTestCase;

public final class KatasPutControllerShould extends RequestTestCase {
    @Test
    void create_a_valid_non_existing_course() throws Exception {
        this.assertRequestWithBody(
            "PUT",
            "/courses/1aab45ba-3c7a-4344-8936-78466eca77fa",
            "{\"name\": \"The best kata\", \"duration\": \"5 hours\"}",
            201
        );
    }
}
