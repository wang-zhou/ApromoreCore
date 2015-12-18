/*
 * Copyright © 2009-2015 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package org.apromore.mapper;

import org.apromore.model.DomainsType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Domain Mapper Unit test.
 *
 * @author <a href="mailto:cam.james@gmail.com">Cameron James</a>
 * @since 1.0
 */
public class DomainMapperUnitTest {

    DomainMapper mapper;

    @Before
    public void setUp() throws Exception {
        mapper = new DomainMapper();
    }

    @Test
    public void testConvertFromDomains() throws Exception {
        List<String> domains = new ArrayList<String>();
        String typ1 = "jack";
        String typ2 = "john";
        domains.add(typ1);
        domains.add(typ2);

        DomainsType type = mapper.convertFromDomains(domains);
        assertThat(type.getDomain().size(), equalTo(domains.size()));
        assertThat(type.getDomain().get(0), equalTo(domains.get(0)));
        assertThat(type.getDomain().get(0), equalTo(domains.get(0)));
    }

}
