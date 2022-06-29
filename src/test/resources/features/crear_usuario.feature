Feature: Crear usuario PetStore

  @test1
  Scenario: Crear usuario

    When creo el usuario con username"edinsonpelaez", firstname"Edinson", lastname"Pelaez"
    Then el codigo de respuesta es 200
    And el type es "unknown"