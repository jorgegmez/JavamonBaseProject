package javamon.utils.serialization;

import javamon.utils.enums.Platform;

public class SerializerFatory {

	public static JavamonSerializator GetSerialize(Platform targetPlatform) {
		switch(targetPlatform) {
			case NINTENGO_CLASSIC:
				return new SerializatorXML();
			case NINTENGO_GAMEBOY:
				return new SerializatorJSON();
			default: 
				return null;
		}
	}

}
