package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.CallbackRet2;
import jsinterop.annotations.JsType;

/**
 * Tabulator options.
 */
@JsType
public class TabulatorOptions {

    //Layout
    public final static String LAYOUT_FITDATA = "fitData"; //default
    public final static String LAYOUT_FITDATA_FILL = "fitDataFill";
    public final static String LAYOUT_FITCOLUMNS = "fitColumns";
    //Responsive layout
    public final static String RESPONSIVE_LAYOUT_HIDE = "hide";
    public final static String RESPONSIVE_LAYOUT_COLLAPSE = "collapse";
    //Formatter
    public final static String FORMATTER_RESPONSIVE_COLLAPSE = "responsiveCollapse";
    public String layout = LAYOUT_FITDATA;
    public Boolean layoutColumnsOnNewData;
    public StringOrBoolean responsiveLayout;
    public CallbackRet2<String, String, ColumnTitleValue[]> responsiveLayoutCollapseFormatter;
    public Boolean responsiveLayoutCollapseUseFormatters;
    public Boolean responsiveLayoutCollapseStartOpen;
    public String formatter;

    public StringOrInteger height;
    public Boolean virtualDom;
    public int virtualDomBuffer;
    public StringOrNode placeholder;
    public StringOrNode footerElement;
    public Boolean tooltips;
    public String tooltipGenerationMode;
    public Columns[] columns;

    @JsType
    public static class Columns {
        public String title;
        public String field;
        public int widthGrow = 1;
        public int widthShrink = 0;
    }


    @JsType
    public static class ColumnTitleValue {
        public String title;
        public Object value;
    }
}



