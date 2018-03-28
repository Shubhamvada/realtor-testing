Feature:

  Scenario: Navigate to realtor.com
    Given User navigate to realtor website
    When Location entered <town> in searchBox
    Then Relevant listing result more than zero
