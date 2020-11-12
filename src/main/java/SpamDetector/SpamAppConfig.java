package SpamDetector;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class SpamAppConfig{

/*  Doesn't work    
    @Bean
        public SpamDetector simpleSpamDetector( @Value("${sbb.spamwords.filename}") String filename) throws IOException {
    	    List<String> spamWords = new ArrayList<String>();
            spamWords = Files.readAllLines(Paths.get(filename));
            return new SimpleDetector(spamWords);
    }*/

    @Bean
        public SpamDetector simpleSpamDetector() throws IOException{
            String filename = "src//main//resources//spamword.txt";
	    List<String> spamWords = new ArrayList<String>();
            spamWords = Files.readAllLines(Paths.get(filename));
            return new SimpleDetector(spamWords);
    }

    @Bean
    public ControlFlow controlFlow(SpamDetector spamDetector){
        return new ControlFlow(spamDetector);
    }
}