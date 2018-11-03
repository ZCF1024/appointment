package com.zut.trpplus.utils;

import com.thoughtworks.xstream.XStream;
import com.zut.trpplus.dao.domain.wx_message.TextMessageXML;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/08/09.
 */
public class MessageUtil {

    public static Map<String, String> xmlToMap(HttpServletRequest request) throws IOException, DocumentException {
        Map<String, String> map = new HashMap<String, String>();
        SAXReader reader = new SAXReader();

        InputStream inputStream = request.getInputStream();
        Document document = reader.read(inputStream);

        Element root = document.getRootElement();

        List<Element> list = root.elements();

        for (Element element : list) {
            map.put(element.getName(), element.getText());
        }

        inputStream.close();
        return map;
    }

    public static Map<String, String> strToMap(String string) throws IOException, DocumentException, ParserConfigurationException, SAXException {
        Map<String, String> map = new HashMap<String, String>();
        SAXReader reader = new SAXReader();
        InputStream inputStream = new ByteArrayInputStream(string.getBytes("UTF-8"));
        Document document = reader.read(inputStream);

        Element root = document.getRootElement();

        List<Element> list = root.elements();

        for (Element element : list) {
            map.put(element.getName(), element.getText());
        }

        inputStream.close();
        return map;
    }

    public static String textMessageToXml(TextMessageXML textMessageXML) {
        XStream xStream = new XStream();
        xStream.alias("xml", textMessageXML.getClass());
        return xStream.toXML(textMessageXML);
    }
}
