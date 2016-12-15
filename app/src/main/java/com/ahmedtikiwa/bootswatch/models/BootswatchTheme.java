package com.ahmedtikiwa.bootswatch.models;

/**
 * Created by ahmed on 2016/12/15.
 */

public class BootswatchTheme {

    private String name;
    private String description;
    private String thumbnail;
    private String preview;
    private String css;
    private String cssMin;
    private String cssCdn;
    private String less;
    private String lessVariables;
    private String scss;
    private String scssVariables;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getCssMin() {
        return cssMin;
    }

    public void setCssMin(String cssMin) {
        this.cssMin = cssMin;
    }

    public String getCssCdn() {
        return cssCdn;
    }

    public void setCssCdn(String cssCdn) {
        this.cssCdn = cssCdn;
    }

    public String getLess() {
        return less;
    }

    public void setLess(String less) {
        this.less = less;
    }

    public String getLessVariables() {
        return lessVariables;
    }

    public void setLessVariables(String lessVariables) {
        this.lessVariables = lessVariables;
    }

    public String getScss() {
        return scss;
    }

    public void setScss(String scss) {
        this.scss = scss;
    }

    public String getScssVariables() {
        return scssVariables;
    }

    public void setScssVariables(String scssVariables) {
        this.scssVariables = scssVariables;
    }

}