
import com.github.tomakehurst.wiremock.client.WireMock
import com.github.tomakehurst.wiremock.client.WireMock._

object TestApp extends App {


      stubFor(
        get(urlPathEqualTo(s"/availability/vod/productions"))
          .withQueryParam("broadcaster", equalTo("ITV"))
          .willReturn(
            aResponse()
              .withHeader("Content-Type", "application/json")
              .withStatus(200).withBody("""{ "name" : "foo" }""")
          )
      )



}
