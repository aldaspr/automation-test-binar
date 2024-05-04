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
import java.util.Random as Random
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Secondhand Website/Arif/Step Definition/Features Login/TC.Lgn.001.001 - Login Correct Credentials'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Terjual/Click icon list'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Terjual/Click submenu produk terjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Terjual/Scroll page produk terjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Terjual/Open detail of produk terjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Terjual/Edit produk terjual'), [:], FailureHandling.STOP_ON_FAILURE)

// Menghasilkan random string dengan panjang tertentu
def random_part = RandomStringUtils.randomAlphanumeric(10)

// Menggabungkan kata statis dengan string acak
def final_product_name = 'tronton ' + random_part

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Input product name'), [('productName') : final_product_name], 
    FailureHandling.STOP_ON_FAILURE)

def random_price = new Random().nextInt(9000) + 10001

// Menggunakan angka bulat acak sebagai string
def final_price = random_price.toString()

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Input price'), [('price') : final_price], 
    FailureHandling.STOP_ON_FAILURE)

int randomNumber = ((Math.random() * ((5 - 1) + 1)) as int) + 1

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Select category'), [('index') : randomNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Input product desc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Secondhand Website/Mutiara - Produk Diminati/Edit Produk Diminati/btnPreview'), 0)

WebUI.callTestCase(findTestCase('Secondhand Website/Mutiara/Pages/Produk Diminati/Click preview button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

