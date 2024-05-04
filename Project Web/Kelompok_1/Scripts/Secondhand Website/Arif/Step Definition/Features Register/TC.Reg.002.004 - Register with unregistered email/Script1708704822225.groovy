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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Home/Click Button Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Login/Click Daftar di sini'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Register/Input Name'), [('name') : 'Agus Kopling'], FailureHandling.STOP_ON_FAILURE)

'generate random string untuk email'
String randomString = RandomStringUtils.randomAlphanumeric(5)

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Register/Input Email'), [('email') : randomString + '@mail.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Register/Input Password'), [('password') : '123'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Register/Click Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Pages/Home/Verify Content Logged'), [:], FailureHandling.STOP_ON_FAILURE)

