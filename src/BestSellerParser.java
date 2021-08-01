import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class BestSellerParser {
	private final File xml = new File("./bestseller.xml");
	private List<BestSeller> list = new ArrayList<>();
	
	public List<BestSeller> getBestSeller() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document doc = builder.parse(xml);
			
			Element root = doc.getDocumentElement();
			parse(root);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void parse(Element root) {
		NodeList bestSellers = root.getElementsByTagName("item");
		for(int i=0;i<bestSellers.getLength();i++) {
			Node child = bestSellers.item(i);
			list.add(getBestSeller(child));
		}
	}
	
	public static BestSeller getBestSeller(Node node) {
		BestSeller bestSeller = new BestSeller();
		
		NodeList subNodes = node.getChildNodes();
		
		for(int j=0;j<subNodes.getLength();j++){
			Node sub = subNodes.item(j);
			if (sub.getNodeName().equals("title")) {
				bestSeller.setTitle(sub.getTextContent());
			} else if (sub.getNodeName().equals("description")) {
				bestSeller.setDesc(sub.getTextContent());
			} else if (sub.getNodeName().equals("priceStandard")) {
				bestSeller.setPrice(Integer.parseInt(sub.getTextContent()));
			}
		}
		return bestSeller;
	}
}
