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

WebUI.navigateToUrl('http://localhost:5173/plants')

WebUI.click(findTestObject('Object Repository/EditPlant_Page/btn_EditPlant'))

WebUI.sendKeys(findTestObject('Object Repository/AddNewPlant_Page/txt_PlantName'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_ScientificName'), 'Chlorophytum comosum')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_URL'), 'https://file.hstatic.net/200000455999/article/y_nghia_hoa_hong_a3efe1fd01cc435a8c85d1ddfd71748f.png')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Overview'), 'Cây nhện (Chlorophytum comosum) là loại cây cảnh phổ biến, dễ chăm sóc và có khả năng sinh trưởng nhanh.')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Characteristic'), 'Lá dài, mảnh, xanh với các sọc trắng dọc theo mép. ')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Uses'), 'Trang trí nội thất, cải thiện không khí.')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_Meaning'), 'Tượng trưng cho sự phát triển và thịnh vượng.')

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_DifficultyLevel'), 'Khó', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_SoilType'), 'Đất bùn', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_Category'), 'Cây ôn đới', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_GrowingLocation'), 'Văn phòng', true)

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_LowTemperature'), '23')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_HightTemperature'), '40')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_SmallestAdultSize'), '1')

WebUI.setText(findTestObject('Object Repository/AddNewPlant_Page/txt_MaximumAdultSize'), '40')

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_Humidity'), 'Cao', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_Light'), 'Thấp', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/AddNewPlant_Page/ddl_BrowseContent'), 'Đã duyệt', true)

WebUI.click(findTestObject('Object Repository/AddNewPlant_Page/btn_Save'))
//WebUI.verifyElementText(findTestObject('Object Repository/AddNewPlant_Page/lbl_error_NamePlant'), 'Tên cây trồng là bắt buộc')
//WebUI.scrollToElement(findTestObject('Object Repository/AddNewPlant_Page/lbl_error_NamePlant'),3)
TestObject element = findTestObject('Object Repository/AddNewPlant_Page/lbl_error_NamePlant')

WebUI.executeJavaScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", Arrays.asList(WebUI.findWebElement(element)))

//WebUI.callTestCase(findTestCase('Plant management/PLANT_MANAGEMENT_011'), [:], FailureHandling.STOP_ON_FAILURE)
// Chờ 2 giây
WebUI.delay(2)

// Đóng trình duyệt
WebUI.closeBrowser()
