package com.daxue;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }


    @Test
    public void test() {

    }

    public Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
    }

    public void bar(Document document) throws DocumentException {

        Element root = document.getRootElement();

        // iterate through child elements of root
        for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
            Element element = it.next();
            // do something
        }

        // iterate through child elements of root with element name "foo"
        for (Iterator<Element> it = root.elementIterator("foo"); it.hasNext();) {
            Element foo = it.next();
            // do something
        }

        // iterate through attributes of root
        for (Iterator<Attribute> it = root.attributeIterator(); it.hasNext();) {
            Attribute attribute = it.next();
            // do something
        }
    }


    public void bar1(Document document) {
        List<Node> list = document.selectNodes("//foo/bar");

        Node node = document.selectSingleNode("//foo/bar/author");

        String name = node.valueOf("@name");
    }


    public void treeWalk(Document document) {
        treeWalk(document.getRootElement());
    }


    public void treeWalk(Element element) {
        for (int i = 0, size = element.nodeCount(); i < size; i++) {
            Node node = element.node(i);
            if (node instanceof Element) {
                treeWalk((Element) node);
            }
            else {
                // do something…
            }
        }
    }



    public class Foo {

        public Document createDocument() {
            Document document = DocumentHelper.createDocument();
            Element root = document.addElement("root");

            Element author1 = root.addElement("author")
                    .addAttribute("name", "James")
                    .addAttribute("location", "UK")
                    .addText("James Strachan");

            Element author2 = root.addElement("author")
                    .addAttribute("name", "Bob")
                    .addAttribute("location", "US")
                    .addText("Bob McWhirter");

            return document;
        }
    }


}
