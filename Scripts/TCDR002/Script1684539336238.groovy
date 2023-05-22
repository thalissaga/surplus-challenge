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

WebUI.callTestCase(findTestCase('TCDR001'), [('closeApp') : false], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Filter/Filter'), 0)

switch(kategori) {
	case("makananberat"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Makanan Berat'), 0)
		break;
	case("makananvegan"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Makanan Vegan'), 0)
		break;
	case("rotidankue"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Roti dan Kue'), 0)
		break;
	case("bahanmakanan"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Bahan Makanan'), 0)
		break;
	case("buahdansayur"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Buah dan Sayur'), 0)
		break;
	case("camilan"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Camilan'), 0)
		break;
	case("minuman"):
		Mobile.tap(findTestObject('Object Repository/Filter/Kategori/android.widget.TextView - Minuman'), 0)
		break;
}

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Filter/Terapkan Filter'), 0)

Mobile.delay(10)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()
