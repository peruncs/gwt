package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.base.JsPropertyMap;


/**
 * Mutator callback.
 */
@JsFunction
@FunctionalInterface
public interface MutatorAccessor {
    /**
     * @param value     - original value of the cell
     * @param data      - the data for the row
     * @param type      - the type of mutation occurring  (data|edit|download|clipboard)
     * @param params    - the mutatorParams object from the column definition
     * @param component - when the "type" argument is "edit",
     *                  this contains the cell component for the edited cell, otherwise it is the column component for the column
     * @return return the new value
     */
    JsObject onMutate(JsObject value, JsObject data, String type, JsPropertyMap<String> params, BaseComponent component);
}
