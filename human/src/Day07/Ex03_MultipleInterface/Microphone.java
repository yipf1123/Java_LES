package Day07.Ex03_MultipleInterface;

public interface Microphone {

	int inputVolumeMax = 50;
	int inputVolumeMin = 5;
	
	// μμ± μΈμ
	String receiveVoice(String voice);
	
}
