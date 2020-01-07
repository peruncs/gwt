package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ClipboardPasteParser {
    BooleanOr<JsObject[]> parse(String clipboardData);
}
