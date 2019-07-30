package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

/**
 * There are a number of options you can pass into the PDF downloader to configure the output
 * <p>
 * orientation - the orientation of the page, either portrait or landscape (default value of landscape)
 * title - optional page title
 * rowGroupStyles - style object for row group headers if used (if you want to override the default styling), it can take any of the standard Autotable style options
 * rowCalcStyles - style object for column calculation rows if used (if you want to override the default styling), it can take any of the standard Autotable style options
 * jsPDF - an optional object that will be passed into the jsPDF constructor and can take any of the standard jsPDF options
 * autoTable - an optional object that can be used to configure advanced styling on the table if needed, this can take ay of the standard AutoTable options
 */
@JsType
public class PDFDownloadConfig {

    /**
     * "portrait" or "landscape".
     */
    public String orientation;
    public String title;
    public JsPropertyMap<String> jsPDF;

    /**
     * advanced table styling, could be callback function
     */
    public Any autoTable;

    /**
     * Can be set on the download config object, that is passed the jsPDF document object after the auto-table creation to allow full customisation of the PDF,
     * see the jsPDF document for a full list of methods that can be called on this object.
     */
    public Callback1<JsObject /*doc object*/> documentProcessing;
}
