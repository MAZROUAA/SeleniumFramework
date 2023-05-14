Feature: User Registration
  I want to check that user can register in our e-commerce website.

  Scenario Outline: User Registration
    Given  the user in the home page
    When I click on register link
    And  I entered the "<firstname>" , "<lastname>" , "<email>" , "<pass>"
    Then the registration page displayed successfully
    Examples:
      | firstname | lastname | email | pass |
      | mohamed | ahmed | mmmm@gmail.com | 1111111 |
      | ggsjd | ffdjjf | hhhh@gmail.com | 12333333 |

