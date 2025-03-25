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

WebUI.openBrowser("")
WebUI.navigateToUrl('http://localhost:5173/login')

//verify invalid email
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/LoginPage/hdl_Login')), "Đăng nhập")
WebUI.setText(findTestObject('Object Repository/LoginPage/txt_email'), 'stringgmail.com')
WebUI.setText(findTestObject('Object Repository/LoginPage/txt_Password'), '123123123')

WebUI.click(findTestObject('Object Repository/LoginPage/btn_Login'))
WebUI.delay(1)

//verify invalid password
WebUI.sendKeys(findTestObject('Object Repository/LoginPage/txt_email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/LoginPage/txt_email'), 'string@gmail.com')
WebUI.sendKeys(findTestObject('Object Repository/LoginPage/txt_Password'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/LoginPage/txt_Password'), '123123')
WebUI.click(findTestObject('Object Repository/LoginPage/btn_Login'))


