Feature:
  @smoke
  Scenario:
    When i reach FAS website and get title
    And Select page 'Access Control'
    Then veryfy website title is 'FAS | Access Control'
    When in page scroll down click btn to top
    Then click menu to navigate to 'contact us'
    And verify the page title 'FAS | Contact Us'
    Then create name 'Tomi Leshia'
      *  enter email 'tomleshi@gmail.com'
      *  enter text 'This is an Automation test for quality assurance. Please disregard.'
      *  click send button
    And click home button for main page assert page address