package com.evilcorp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CamelCaseTest {
  @Test
  public void tests() {
    assertEquals( "Incorrect", "camel Casing", CamelCase.camelCase("camelCasing"));
    assertEquals( "Incorrect", "camel Casing Test", CamelCase.camelCase("camelCasingTest"));
    assertEquals( "Incorrect", "camelcasingtest", CamelCase.camelCase("camelcasingtest"));
  }
}
