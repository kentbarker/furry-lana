package source;

import java.util.HashMap;
import java.util.Map;

import models.Summoner;
import utils.Converter;
import utils.DefaultData;


public class Driver {
	
	public static void main(String[] args) throws Exception {
		
		Map<String, Summoner> Summoners = new HashMap<String, Summoner>();
		String summonerToGet = "frictionkbl,spedkbl";
		String summoners[] = summonerToGet.split(",");
		String myUrl = DefaultData.summonerByName + summonerToGet + DefaultData.key;

		
		try {
			FetchUrl fetch = new FetchUrl();
			String results = fetch.doHttpUrlConnectionAction(myUrl);			
			System.out.println(results);
			
			Summoners = Converter.fromJSONSummoner(results);

			System.out.println(Summoners.get(summoners[0]).getName());		

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void tester(long... stuff){
		
	}

}
