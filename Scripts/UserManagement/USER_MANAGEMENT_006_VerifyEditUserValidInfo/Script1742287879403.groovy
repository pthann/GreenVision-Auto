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
WebUI.navigateToUrl(GlobalVariable.UM)

//Verify that the username has been edited successfully
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_EditUsername'))
WebUI.clearText(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Username'))
WebUI.setText(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Username'), 'riina')
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_Save'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/EditUser/td_Username'), 'riina')

//Verify that the email has been edited successfully
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_EditUsername'))
WebUI.clearText(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Email'))
WebUI.setText(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Email'), 'rrina@gmail.com')
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_Save'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/EditUser/td_Email'), 'rrina@gmail.com')

//Verify that the address has been edited successfully
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_EditUsername'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/EditUser/txt_CityOrProvince'), "Thành phố Đà Nẵng", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Distric'), "Quận Sơn Trà", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/EditUser/txt_WardOrCommune'), "Phường Phước Mỹ", false)
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_Save'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/EditUser/td_Address'), "Phường Phước Mỹ, Quận Sơn Trà, Thành phố Đà Nẵng")

//Verify role the address has been edited successfully
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_EditUsername'))
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Role'), "admin", false)
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/btn_Save'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/EditUser/td_Role'), "admin")

WebUI.closeBrowser()

