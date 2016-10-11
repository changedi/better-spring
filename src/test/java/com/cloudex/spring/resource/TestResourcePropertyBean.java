package com.cloudex.spring.resource;


import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by zunyuan.jy on 16/10/11.
 */
public class TestResourcePropertyBean implements IResourceLoad {

    private Resource file;

    public void setFile(Resource file) {
        this.file = file;
    }

    @Override
    public void load() {
        try {
            print(file.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
