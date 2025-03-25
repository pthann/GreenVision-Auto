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

WebUI.click(findTestObject('Object Repository/UserManagementPage/CreateUser/btn_AddUser'))

//Verify that creation fails when all fields are empty
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_UserName'), "")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Email'), "")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Password'), "")
WebUI.click(findTestObject('Object Repository/UserManagementPage/CreateUser/btn_SaveCreateUser'))

WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_UsernameRequired'), 'Tên người dùng là bắt buộc')
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_EmailRequired'), 'Email là bắt buộc')
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_PwRequired'), 'Mật khẩu là bắt buộc')
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_ProvinceRequired'), 'Tỉnh/Thành phố là bắt buộc')
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_RoleRequired'), 'Vai trò là bắt buộc')

//Verify that creation fails when username fields are empty
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_UserName'), "")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Email'), "dina1@gmail.com")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Password'), "naiu12345")
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_ProvinceOrCity'), "Thành phố Đà Nẵng", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_District'), "Quận Sơn Trà", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_WardOrCommune'), "Phường Phước Mỹ", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_Role'), "users", false)
WebUI.click(findTestObject('Object Repository/UserManagementPage/CreateUser/btn_SaveCreateUser'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_UsernameRequired'), 'Tên người dùng là bắt buộc')

//Verify that creation fails when email fields are empty
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_UserName'), "dinaiu")
WebUI.click(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Email'))
WebUI.sendKeys(findTestObject('Object Repository/UserManagementPage/EditUser/txt_Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Password'), "naiu12345")
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_ProvinceOrCity'), "Thành phố Đà Nẵng", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_District'), "Quận Sơn Trà", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_WardOrCommune'), "Phường Phước Mỹ", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_Role'), "users", false)

WebUI.click(findTestObject('Object Repository/UserManagementPage/CreateUser/btn_SaveCreateUser'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_EmailRequired'), 'Email là bắt buộc')

//Verify that creation fails when passwords fields are empty
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_UserName'), "dinana")
WebUI.setText(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Email'), "dina2@gmail.com")
WebUI.click(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Password'))
WebUI.sendKeys(findTestObject('Object Repository/UserManagementPage/CreateUser/txt_Password'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_ProvinceOrCity'), "Thành phố Đà Nẵng", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_District'), "Quận Sơn Trà", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_WardOrCommune'), "Phường Phước Mỹ", false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/UserManagementPage/CreateUser/ddl_Role'), "users", false)

WebUI.click(findTestObject('Object Repository/UserManagementPage/CreateUser/btn_SaveCreateUser'))
WebUI.verifyElementText(findTestObject('Object Repository/UserManagementPage/CreateUser/msg_PwRequired'), 'Mật khẩu là bắt buộc')

WebUI.closeBrowser()


