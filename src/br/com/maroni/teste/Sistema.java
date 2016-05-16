package br.com.maroni.teste;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Sistema {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fabrica.newDocumentBuilder();
		Document document = builder.parse("src/vendas.xml");
		NodeList formasDePagamentos = document.getElementsByTagName("formaDePagamento");
		Element fdp = (Element) formasDePagamentos.item(0);
		String formaDePagamento = fdp.getTextContent();
		System.out.println(formaDePagamento);
	}
}
