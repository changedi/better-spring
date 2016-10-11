package com.cloudex.spring.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

/**
 * Created by zunyuan.jy on 16/10/11.
 */
public class TestResourceLoaderBean implements /*ResourceLoaderAware, */IResourceLoad {

    @javax.annotation.Resource
    private ResourceLoader resourceLoader;

//    @Override
//    public void setResourceLoader(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }

    @Override
    public void load() {
        Resource resource = resourceLoader.getResource("classpath:config/config.properties");
//        Resource resource = ctx.getResource("file:///Users/zunyuan.jy/github/better-spring/src/test/resources/config/config.properties");
        System.out.println(resource.getFilename());
        try {
            print(resource.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
