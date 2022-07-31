Feature: Testing Weather API

  Scenario: Checking weather for the city
    Given city id: 524901

    When we are requesting weather data

    Then coords are:
      | lon | 145.76 |
      | lat | -16.92 |

    And weather is:
      | id          | 802              |
      | main        | Clouds           |
      | description | scattered clouds |
      | icon        | 03n              |

    And base is "stations"

#    And main is:
#      | temp     | 300.15 |
#      | pressure | 1007   |
#      | humidity | 74     |
#      | temp_min | 300.15 |
#      | temp_max | 300.15 |

#    TODO: Homework: add all other steps