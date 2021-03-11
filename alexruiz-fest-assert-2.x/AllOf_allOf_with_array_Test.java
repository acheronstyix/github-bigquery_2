/*
 * Created on Feb 7, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * Copyright @2011-2013 the original author or authors.
 */
package org.fest.assertions.condition;

import static junit.framework.Assert.assertEquals;

import static org.fest.test.ExpectedException.none;
import static org.fest.util.Arrays.array;
import static org.fest.util.Lists.newArrayList;

import org.fest.assertions.core.Matcher;
import org.fest.assertions.core.TestMatcher;
import org.fest.test.ExpectedException;
import org.junit.Rule;
import org.junit.Test;

/**
 * Tests for {@link AllOf#allOf(Matcher...)}.
 *
 * @author Yvonne Wang
 */
public class AllOf_allOf_with_array_Test {
  @Rule
  public ExpectedException thrown = none();

  @SuppressWarnings("unchecked")
  @Test
  public void should_create_new_AllOf_with_passed_Conditions() {
    Matcher<Object>[] conditions = array(new TestMatcher<Object>(), new TestMatcher<Object>());
    Matcher<Object> created = AllOf.allOf(conditions);
    assertEquals(AllOf.class, created.getClass());
    AllOf<Object> allOf = (AllOf<Object>) created;
    assertEquals(newArrayList(conditions), allOf.conditions);
  }
}
