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

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Step Definition/Features Login/TC.Lgn.001.001 - Login Correct Credentials'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Click icon list'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Click submenu produk diminati'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Scroll page produk diminati'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Open detail of produk diminati'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Edit produk diminati'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Secondhand Website/Mutiara - Produk Diminati/Edit Produk Diminati/field_namaproduk'))

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Click terbitkan button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Secondhand Website/Mutiara - Produk Diminati/Edit Produk Diminati/btnBack'), 
    0)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Verify warning text visible'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

