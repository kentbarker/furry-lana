package utils;

public class DefaultData {

	public final static String region = "NA"; //BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR; not every region works on every command
	public final static String key = "?api_key=" + "your key here";
	public final static String head = "https://na.api.pvp.net/api/lol/";
	
	public final static String summonerByName = head + region + "/v1.4/summoner/by-name/";// + name1,name2,....
	public final static String summonerById = head + region + "/v1.4/summoner/";// + id1,id2,....
																						// + /masteries
																						// + /name
																						// + /runes
	
	public final static String teamBySummoner = head + region + "/v2.4/team/by-summoner/";// + Sid1,Sid2,....
	public final static String teamById = head + region + "/v2.4/team/";// + Tid1,Tid2....
	
	public final static String statsBySummoner = head + region + "/v1.3/stats/by-summoner/";// + Sid + (/ranked || /summary);
}
