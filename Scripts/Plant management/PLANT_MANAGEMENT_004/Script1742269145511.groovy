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

WebUI.navigateToUrl('http://localhost:5173/')

// Giả sử bạn đã có một danh sách cây và click vào cây cần chỉnh sửa
WebUI.click(findTestObject('null'))

// Xóa nội dung cũ và nhập thông tin mới
WebUI.setText(findTestObject('null'), 'Hồng Mới')
WebUI.setText(findTestObject('null'), 'Hồng Lan Mới')
WebUI.setText(findTestObject('null'), 'https://drive.google.com/file/d/1SN8JzAK8gi9kyrdoQpPjcmp6O4CKX6of/view?usp=drive_link')
WebUI.setText(findTestObject('null'), 'Thông tin mới')
WebUI.setText(findTestObject('null'), 'Đặc điểm mới')
WebUI.setText(findTestObject('null'), 'Công dụng mới')
WebUI.setText(findTestObject('null'), 'Ý nghĩa mới')

// Chọn lại các tùy chọn nếu cần
WebUI.selectOptionByLabel(findTestObject('null'), 'Dễ', true)
WebUI.selectOptionByLabel(findTestObject('null'), 'Đất thịt', true)
WebUI.selectOptionByLabel(findTestObject('null'), 'Cây thân gỗ', true)
WebUI.selectOptionByLabel(findTestObject('null'), 'Ngoài trời', true)
WebUI.setText(findTestObject('null'), '20')
WebUI.setText(findTestObject('null'), '35')
WebUI.setText(findTestObject('null'), '2')
WebUI.setText(findTestObject('null'), '50')
WebUI.selectOptionByLabel(findTestObject('null'), 'Vừa', true)
WebUI.selectOptionByLabel(findTestObject('null'), 'Trung bình', true)
WebUI.selectOptionByLabel(findTestObject('null'), 'Đã duyệt', true)

// Lưu thay đổi
WebUI.click(findTestObject('null'))