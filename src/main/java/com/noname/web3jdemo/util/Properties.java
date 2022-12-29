package com.noname.web3jdemo.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Properties {

        private static java.util.Properties prop;

        static{
            InputStream is = null;
            try {
                prop = new java.util.Properties();
                is = Properties.class.getResourceAsStream("/web3jdemo.properties");
                prop.load(is);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String getPropertyValue(String key){
            return prop.getProperty(key);
        }

}
