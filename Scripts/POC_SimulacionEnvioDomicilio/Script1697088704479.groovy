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

WebUI.openBrowser('https://www.lacomer.com.mx/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/span_Ingresa'))

WebUI.setText(findTestObject('Object Repository/input_LaComer Login_j_username'), 'ian_al98@hotmail.es')

WebUI.setEncryptedText(findTestObject('Object Repository/input_LaComer Login_j_password'), 'OmDeAuJ1p0v9+I26niaU1A==')

WebUI.click(findTestObject('Object Repository/a_Entrar'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/a_Entrar'), 30)

WebUI.waitForElementClickable(findTestObject('Object Repository/input_BUSCAR PRODUCTOS_idSearch'), 30)

WebUI.click(findTestObject('Object Repository/input_BUSCAR PRODUCTOS_idSearch'))

WebUI.setText(findTestObject('Object Repository/input_BUSCAR PRODUCTOS_idSearch'), 'Aceite canola')

WebUI.sendKeys(findTestObject('Object Repository/input_BUSCAR PRODUCTOS_idSearch'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Object Repository/img_productFirst'))

WebUI.click(findTestObject('Object Repository/button_Resultados de tu bsqueda_btn_addtoCa_d084b1'))

WebUI.click(findTestObject('Object Repository/img_Agregaste al carrito 1 pieza de Aceite _698e96'))

WebUI.setText(findTestObject('Object Repository/input_Agregaste al carrito 1 pieza de Aceit_9b1229'), 'pinol')

WebUI.sendKeys(findTestObject('Object Repository/input_Agregaste al carrito 1 pieza de Aceit_9b1229'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/img_Resultados de tu bsqueda_li_prod_mosaic'))

WebUI.setText(findTestObject('Object Repository/input_77.00 M.N. pieza_pediCant'), '2')

WebUI.click(findTestObject('Object Repository/button_Piezas_addShopCartDetail'))

WebUI.click(findTestObject('Object Repository/img_Salir_carritoH'))

WebUI.click(findTestObject('Object Repository/button_recoger'))

WebUI.click(findTestObject('Object Repository/button_NO (1)'))

WebUI.click(findTestObject('Object Repository/button_aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/button_continuarHorario'))

WebUI.click(findTestObject('Object Repository/button_horario'))

WebUI.click(findTestObject('Object Repository/button_aceptar'))

WebUI.click(findTestObject('Object Repository/button_continuar'))

WebUI.click(findTestObject('Object Repository/button_contraEntrega'))

WebUI.navigateToUrl('https://www.lacomer.com.mx/lacomer/')

WebUI.click(findTestObject('Object Repository/img_Salir_carritoH_1'))

WebUI.click(findTestObject('Object Repository/div_Vaciar carrito'))

WebUI.click(findTestObject('Object Repository/button_S'))

WebUI.closeBrowser()