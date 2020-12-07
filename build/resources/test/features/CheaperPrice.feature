Feature: Verify the rates charged to customers

  Scenario: Search for the hotels with the cheapest rate
    Given That the user is on the Homepage of the application DX Hotels
    When User click in select the Location New York
    And User click in select the Check in 2020/12/24
    And User click in select the Check out 2020/12/25
    And User click in select the Rooms 1
    And User click in select Aduls 1
    And User click in select Childres 0
    And User click in Search Button
    And User click lower price
    