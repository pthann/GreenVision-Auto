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

WebUI.navigateToUrl('http://localhost:5173/login')

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/LoginPage/hdl_Login')), "Đăng nhập")
WebUI.setText(findTestObject('Object Repository/LoginPage/txt_email'), 'string@gmail.com')
WebUI.setText(findTestObject('Object Repository/LoginPage/txt_Password'), '123123123')

WebUI.click(findTestObject('Object Repository/LoginPage/btn_Login'))

//WebUI.click(findTestObject('Object Repository/AddNewPlant_Page/ddl_Category'))
WebUI.click(findTestObject('Object Repository/EditPlant_Page/btn_UP'))

//WebUI.click(findTestObject('Object Repository/AddNewPlant_Page/ddl_Category'))
WebUI.click(findTestObject('Object Repository/EditPlant_Page/btn_EditPlant'))

//WebUI.click(findTestObject('Object Repository/AddNewPlant_Page/txt_PlantName'))
WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_PlantName'), 'Hoa Linh Lan hồng')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_ScientificName'), 'Orchidaceae')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_URL'), 'https://file.hstatic.net/200000455999/article/y_nghia_hoa_hong_a3efe1fd01cc435a8c85d1ddfd71748f.png')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Overview'), 'Loai chiu nhiet')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Characteristic'), 'Có màu hồng nhạt,vàng và trắng')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Uses'), 'Trang trí, tặng quà vào dịp lễ')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Meaning'), 'Trang trí nhà cửa, văn phòng, công ty')

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_DifficultyLevel'), 'Trung bình', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_SoilType'), 'Đất sét', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_Category'), 'Cây thân thảo', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_GrowingLocation'), 'Trong nhà', true)

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_LowTemperature'), '26')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_HightTemperature'), '42')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_SmallestAdultSize'), '1')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_MaximumAdultSize'), '40')

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_Humidity'), 'Thấp', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_Light'), 'Cao', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_BrowseContent'), 'Chưa duyệt', true)

WebUI.click(findTestObject('Object Repository/AddNewPlant_Page/btn_Save'))

//WebUI.callTestCase(findTestCase('Plant management/PLANT_MANAGEMENT_011'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

// Đóng trình duyệt
WebUI.closeBrowser()
