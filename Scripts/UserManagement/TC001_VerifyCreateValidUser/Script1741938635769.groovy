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
WebUI.navigateToUrl('http://localhost:5173/users')

//Verify header
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/UserManagementPage/thd_Username')), "Tên người dùng" )
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/UserManagementPage/thd_Email')), "Email" )
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/UserManagementPage/thd_Address')), "Địa chỉ" )
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/UserManagementPage/thd_Role')), "Vai trò" )
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/UserManagementPage/thd_Status')), "Trạng thái" )
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/UserManagementPage/thd_Action')), "Hành động" )

WebUI.click(findTestObject('Object Repository/UserManagementPage/btn_AddUser'))

WebUI.setText(findTestObject('Object Repository/UserManagementPage/txt_UserName'), "Naiu")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/txt_Email'), "naiu@gmail.com")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/txt_Password'), "naiu12345")
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/ddl_ProvinceOrCity'), "Thành phố Đà Nẵng", false)
//WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/ddl_District'), "Quận Sơn Trà", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/ddl_WardOrCommune'), "Phường Phước Mỹ", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/ddl_Role'), "users", false)

WebUI.click(findTestObject('Object Repository/UserManagementPage/btn_SaveCreateUser'))
////Verify Home displayed
//WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/LoginPage/lnk_Home')), "HOME" )