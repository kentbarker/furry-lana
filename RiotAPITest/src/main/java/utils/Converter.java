package utils;

import models.Summoner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;

public class Converter {

	public static HashMap<String, Summoner> fromJSONSummoner(String toConvert) {
		final byte[] rawData = toConvert.getBytes();
		try {
			return new ObjectMapper().readValue(new ByteArrayInputStream(
					rawData), new TypeReference<HashMap<String, Summoner>>(){});
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
