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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/rabbitGame/public/')

WebUI.click(findTestObject('Object Repository/New Folder (10)/Page_Home/button__navbar-toggler__custom'))

WebUI.click(findTestObject('Object Repository/New Folder (10)/Page_Home/a_'))

WebUI.click(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__display_name'))

WebUI.click(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/a_'))

WebUI.setText(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__name'), 'Nadasd')

WebUI.setText(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__surname'), 'ASDASD')

WebUI.setText(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__display_name_1'), 'ohmspeed98')

WebUI.setText(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__email'), 'aomspeed777@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__password'), 'Od+6H3u/xQTgmMdPZ2zkiA==')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/input__confirmPassword'), 'i/gsYodLG1Ha3lwUhVBLNA==')

WebUI.click(findTestObject('Object Repository/New Folder (10)/Page_ Rabbit Game/button_'))

WebUI.verifyTextPresent('ชื่อผู้ใช้นี้ถูกใช้แล้ว', false)

