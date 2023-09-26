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

String ss = GlobalVariable.fileSS
String text = "Tidak boleh kosong"
String pass = GlobalVariable.password

WebUI.click(findTestObject("Button/btn_Pengaturanprivasi"))
WebUI.click(findTestObject("Button/btn_Menu_password"))
WebUI.setText(findTestObject("TxtField/Field_passlama"),pass)
WebUI.setText(findTestObject("TxtField/Field_passbaru"),"bukan password")
WebUI.setText(findTestObject("TxtField/Field_passulangbaru"),"bukan pasword")
WebUI.click(findTestObject("Button/btn_simpanpass"))
WebUI.takeScreenshot(ss + "Pengaturan Privasi_Neg_klik button save dengan input field password baru berbeda dengan password ulang baru_1.png")