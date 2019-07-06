package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class DownloadConfig {

    /** include column groups in column headers for download*/
    public boolean columnGroups;

    /**include row groups in download*/
    public boolean rowGroups;

    /**do not include column calculation rows in download*/
    public boolean columnCalcs;
}
