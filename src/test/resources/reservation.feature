Feature: Ticket reservation

  Scenario: Successful ticket reservation
    Given random client with:
      | discount    | CCCCCC     |
      | flight_date | 13-05-2018 |

    And client is flying from "MEL" to "JFC"
    And seat number is 21

    And home page is opened

    When we are selecting airports
    Then selected airports appears on client info page

    When we are filling in passenger info form
    And we are clicking on Get Price ling

    Then passenger name appears
    And price is shown

    When we are pressing Book button
    And selecting seat number

    Then selected seat number appears

    When we are placing the order
    Then successful booking page appears

    When we are requesting all reservations via API
    And we found created reservation

    Then all data stored correctly