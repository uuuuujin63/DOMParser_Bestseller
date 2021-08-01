import java.util.List;

public class DomParserTest {

	public static void main(String[] args) {
		BestSellerParser parser = new BestSellerParser();
		List<BestSeller> list = parser.getBestSeller();
		
		for(BestSeller info : list) {
			System.out.println(info);
		}

	}

}
