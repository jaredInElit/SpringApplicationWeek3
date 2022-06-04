package com.promineotech.jeep.contoller.support;

public class CreateOrderTestSupport extends BaseTest {
  protected String createOrderBody() {
    // @formatter:off

        return "{\n"
        + " \"customer\":\"ROTH_GARTH\",\n"
        + " \"model\":\"CHEROKEE\",\n"
        + " \"trim\":\"Latitude\",\n"
        + " \"doors\":4,\n"
        + " \"color\":\"EXT_VELVET_RED\",\n"
        + " \"engine\":\"2_0_TURBO\",\n"
        + " \"tire\":\"265_GOODYEAR\",\n"
        + " \"options\":[\n"
        + "   \"DOOR_QUAD_4\",\n"
        + "   \"EXT_AEV_LIFT\",\n"
        + "   \"EXT_WARN_WINCH\",\n"
        + "   \"EXT_WARN_BUMPER_FRONT\",\n"
        + "   \"EXT_WARN_BUMPER_REAR\",\n"
        + "   \"EXT_TARA_CARRIER\"\n"
        + " ]\n"
        + "}";
  //  @formatter:on
  }
}
