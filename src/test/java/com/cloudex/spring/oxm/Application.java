package com.cloudex.spring.oxm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Created by zunyuan.jy on 16/11/28.
 */
public class Application {

    private static final String FILE_NAME = "settings.xml";
    private Settings settings = new Settings();
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public static void main(String[] args) throws IOException {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:spring/spring-oxm.xml");
        Application application = (Application) appContext.getBean("application");
        application.saveSettings();
        application.loadSettings();


        Unmarshaller castorMashaller = appContext.getBean("mashaller", Unmarshaller.class);
        FileInputStream is = null;
        try {
            is = new FileInputStream(FILE_NAME);
            Settings settings = (Settings) castorMashaller.unmarshal(new StreamSource(is));
            System.out.println(settings.isFooEnabled());
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public void saveSettings() throws IOException {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(FILE_NAME);
            this.marshaller.marshal(settings, new StreamResult(os));
            System.out.println(this.settings.isFooEnabled());
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public void loadSettings() throws IOException {
        FileInputStream is = null;
        try {
            is = new FileInputStream(FILE_NAME);
            this.settings = (Settings) this.unmarshaller.unmarshal(new StreamSource(is));
            System.out.println(this.settings.isFooEnabled());
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

}
