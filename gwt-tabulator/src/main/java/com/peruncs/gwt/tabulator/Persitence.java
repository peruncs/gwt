package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType
public class Persitence {

    /**
     * Persist column sorting.
     */
    public boolean sort;

    /**
     * Persist filter sorting.
     */
    public boolean filter;

    /**
     * Persists row grouping.
     */
    public BooleanOr<Group> group;

    /**
     * Persist page.
     */
    public BooleanOr<Page> page;

    /**
     * Persist columns. Boolean or array of column names.
     */
    public BooleanOr<String[]> columns;

    /**
     * Group persistence configuration.
     */
    @JsType
    public static class Group {
        public boolean grupBy;
        public boolean groupStartOpen;
        public boolean groupHeader;
    }

    /**
     * Pag persitence configuration.
     */
    @JsType
    public static class Page {
        /**
         * Persiste current page size.
         */
        public boolean size;
        /**
         * Persist current page.
         */
        public boolean page;

    }

    /**
     * A writes for the persistence state of the grid.
     */
    @JsFunction
    @FunctionalInterface
    public interface WriterFunc {
        void store(String id, String type, Object[] data);
    }

    /**
     * A reader for the persistente state of the grid.
     */
    @JsFunction
    @FunctionalInterface
    public interface ReaderFunc {
        void read(String id, String type);
    }
}
