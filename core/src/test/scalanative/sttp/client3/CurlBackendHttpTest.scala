package sttp.client3

import sttp.client3.testing.SyncHttpTest

class CurlBackendHttpTest extends SyncHttpTest {
  override implicit lazy val backend: SttpBackend[Identity, Any] = CurlBackend(verbose = true)
}
