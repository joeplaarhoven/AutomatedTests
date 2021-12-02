import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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

