package jsastrawi.morphology.defaultimpl.visitor.prefixrules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jsastrawi.morphology.defaultimpl.visitor.Disambiguator;

public class PrefixRule18b implements Disambiguator {

    @Override
    public String disambiguate(String word) {        
        Matcher matcher = Pattern.compile("^meny([aiueo])(.*)$").matcher(word);
        if (matcher.find()) {
            return "s" + matcher.group(1) + matcher.group(2);
        }
        
        return word;
    }
}