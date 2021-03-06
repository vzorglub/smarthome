/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.library.types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Simon Kaufmann - Initial contribution and API
 * @author Stefan Triller - more tests for type conversions
 */
public class OpenClosedTypeTest {

    @Test
    public void testConversionToPercentType() {
        assertEquals(PercentType.ZERO, OpenClosedType.CLOSED.as(PercentType.class));
        assertEquals(PercentType.HUNDRED, OpenClosedType.OPEN.as(PercentType.class));
    }

    @Test
    public void testConversionToDecimalType() {
        assertEquals(DecimalType.ZERO, OpenClosedType.CLOSED.as(DecimalType.class));
        assertEquals(new DecimalType(1), OpenClosedType.OPEN.as(DecimalType.class));
    }

    @Test
    public void testConversionToPointType() {
        // should not be possible => null
        assertEquals(null, OpenClosedType.CLOSED.as(PointType.class));
        assertEquals(null, OpenClosedType.OPEN.as(PointType.class));
    }
}
