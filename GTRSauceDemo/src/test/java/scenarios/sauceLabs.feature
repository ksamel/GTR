Feature: Sauce demo site

  Background: 
    * def res = read('classpath:objectRepository/locators.yml')
    * def sauceLabsLoginPage = res.sauceLabsLogin
    * def sauceLabsLandingPage = res.sauceLabsLanding
    

  Scenario Outline: Order products from Swaglabs
    Given driver URL
    * maximize()
    * input(sauceLabsLoginPage.txtUserName, username)
    * input(sauceLabsLoginPage.txtPassword,password)
    * rightOf(sauceLabsLoginPage.btnLogin).find('input').click()
    * match driver.url == 'https://www.saucedemo.com/inventory.html'
    * click(sauceLabsLandingPage.imgProduct)
    * click(sauceLabsLandingPage.btnAddToCart)
    * leftOf(sauceLabsLandingPage.imgShoppingcart).find('a').click()
    * click(sauceLabsLandingPage.btnCheckout)
    * input(sauceLabsLandingPage.txtFName, txtFName)
    * input(sauceLabsLandingPage.txtLName,txtLName)
    * input(sauceLabsLandingPage.txtPostalCode,txtPostalCode)
    * click(sauceLabsLandingPage.btnContinue)
    * click(sauceLabsLandingPage.btnFinish)
    * match text(sauceLabsLandingPage.msgOrderPlacedSucessfully) == successfulMsgText

    Examples: 
      | username      | password     | txtFName   | txtLName | txtPostalCode | successfulMsgText        |
      | standard_user | secret_sauce | Automation | User     |        800001 | THANK YOU FOR YOUR ORDER |
