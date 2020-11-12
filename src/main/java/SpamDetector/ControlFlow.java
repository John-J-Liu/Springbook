package SpamDetector;
public class ControlFlow{
	private SpamDetector spamDetector;

	public ControlFlow(SpamDetector spamDetector){
		this.spamDetector = spamDetector;
	}

    public void run(String[] args){
        System.out.println(spamDetector.containsSpam("He is a dictator"));
      //System.out.println(spamDetector.containsSpam(args[0]));    
    }
}