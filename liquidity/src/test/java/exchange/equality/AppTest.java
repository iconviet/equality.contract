/*
 * Copyright 2020 ICONLOOP Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package exchange.equality;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {
    @Test
    void appHasAName() {
        final String name = "Alice";
        Liquidity classUnderTest = new Liquidity(name);
        assertEquals(classUnderTest.name(), name);
    }

    @Test
    void appHasAGreeting() {
        Liquidity classUnderTest = new Liquidity("Alice");
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
