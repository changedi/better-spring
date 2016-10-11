package com.cloudex.spring.resource;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

/**
 * Created by zunyuan.jy on 16/10/11.
 */
public interface IResourceLoad {

    void load();

    default void print(File file) {
        System.out.println(StringUtils.LF + this.getClass());
        try {
            LineIterator iterator = FileUtils.lineIterator(file, "UTF-8");
            while (iterator.hasNext()) {
                System.out.println("\t" + iterator.nextLine());
            }
            iterator.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
