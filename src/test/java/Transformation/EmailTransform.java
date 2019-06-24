package Transformation;

import cucumber.api.Transformer;

public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String s) {
        return s.concat("@fiends");
    }
}
