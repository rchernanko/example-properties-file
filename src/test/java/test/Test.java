package test;

import util.GetValueFromPropertyFile;

public class Test {

    @org.junit.Test
    public void interactWithPropertiesFile() {
        System.out.println(GetValueFromPropertyFile.getValueFromPropertyFile());
    }
}
