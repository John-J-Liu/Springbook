package SpamDetector;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleDetector implements SpamDetector{

    private List<String> spamWords = new ArrayList<String>();

    public SimpleDetector(List<String> spamWords){
        this.spamWords = spamWords;
    }
    
    @Override
    public boolean containsSpam(String comment){
        for(String word : spamWords){
            if(comment.toLowerCase().contains(word))
                return true;
        }
        return false;
    }
}