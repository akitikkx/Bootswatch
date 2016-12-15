package com.ahmedtikiwa.bootswatch.models;

/**
 * Created by ahmed on 2016/12/15.
 */

import java.util.ArrayList;
import java.util.List;

public class BootswatchThemeListResponse {

    private String version;
    private ArrayList<BootswatchTheme> themes = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<BootswatchTheme> getThemes() {
        return themes;
    }

    public void setThemes(ArrayList<BootswatchTheme> themes) {
        this.themes = themes;
    }

}
