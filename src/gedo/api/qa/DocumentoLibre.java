package gedo.api.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentoLibre extends Documento {

	public DocumentoLibre(WebDriver driver, String rutaCapturasDePantalla) {
		super(driver, rutaCapturasDePantalla);
	}

	/**
	 * TODO: Quitar harcode "file"
	 * 
	 * @param campoReferencia
	 * @param textoReferencia
	 * @param rutaArchivoPuntoDoc
	 */

	public void producirDocumentoLibreImportarWord(String campoReferencia, String textoReferencia,
			String archivoPuntoDoc) {
		getEspera().waitElementByXpath(campoReferencia);
		getDriver().findElement(By.xpath(campoReferencia)).clear();
		getDriver().findElement(By.xpath(campoReferencia)).sendKeys(textoReferencia);
		getDriver().findElement(By.name("file")).sendKeys(RUTAARCHIVOSENTRADA + archivoPuntoDoc);
	}
}