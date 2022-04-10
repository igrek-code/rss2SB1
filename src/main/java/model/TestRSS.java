package model;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;


public class TestRSS {
	public String loadFileXML() {
		Resource resource = new DefaultResourceLoader(). 
				getResource("classpath:xml/item.xml");
		try(Reader reader = new InputStreamReader(resource.getInputStream())){
			return FileCopyUtils.copyToString(reader);
		}
		catch (IOException e) {
			throw new UncheckedIOException(e);
		}


	}
}
