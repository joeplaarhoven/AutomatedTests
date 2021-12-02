import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email_Email'), 'cs.daris@student.avans.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password_Password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Electronics/a_Cell phones'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Cell phones/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Cell phones/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Cell phones/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Cell phones/input_Newest Tricentis smartphone_button-2 _a164c3'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Cell phones/a_Apparel  Shoes'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/input_Jeans_button-2 product-box-add-to-car_50ee1e'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Apparel  Shoes/span_Shopping cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/strong_406.00'), '406.00')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/a_Log out'))

WebUI.closeBrowser()

