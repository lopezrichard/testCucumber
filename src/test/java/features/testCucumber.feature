Feature: TestCucumber

	@TEST_REGRESION
  Scenario: ingreso con credenciales correctas
    Given que ingresas a la web
    When el usuario ingresas sus credenciales validas
    Then ingresas sastifactoriamente al home
