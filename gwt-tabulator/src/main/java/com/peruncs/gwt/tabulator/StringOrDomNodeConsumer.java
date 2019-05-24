package com.peruncs.gwt.tabulator;

import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface StringOrDomNodeConsumer {

    void consume(StringOrNode unionType);

    @JsOverlay
    default void consume(Node foo) {
        consume(StringOrNode.of(foo));
    }


    @JsOverlay
    default void consumeUnionType(String s) {
        consume(StringOrNode.of(s));
    }

    class Impl implements StringOrDomNodeConsumer {

        @Override
        public void consume(StringOrNode stringOrNode) {
            if (stringOrNode.isString()) {
                String s = stringOrNode.asString();
            } else {
                Node node = stringOrNode.asNode();
            }
        }
    }
}


