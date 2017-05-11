package com.peruncs.gwt.utils;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOptional;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public interface JSArray<T> {

    /**
     * adds one or more elements to the end of an array and returns the new
     * length of the array
     *
     * @param elements elements to push
     * @return the new length
     */
    @JsMethod
    @SuppressWarnings("unchecked")
    int push(T... elements);

    /**
     * removes the last element from an array and returns that element.
     *
     * @return last element.
     */
    @JsMethod
    T pop();

    /**
     * @return Removes the first element from an array and returns that element.
     * This method changes the length of the array.
     */
    @JsMethod
    T shift();

    /**
     * adds one or more elements to the beginning of an array and returns the
     * new length of the array
     *
     * @param e new elements
     * @return new length.
     */
    @JsMethod
    @SuppressWarnings("unchecked")
    int unshift(T... e);

    /**
     * returns the first index at which a given element can be found in the
     * array, or -1 if it is not present.
     *
     * @param searchElement the searched element
     * @return first index of searched element
     */
    @JsMethod
    int indexOf(T searchElement);

    /**
     * returns the last index at which a given element can be found in the
     * array, or -1 if it is not present. The array is searched backwards,
     * starting at fromIndex
     *
     * @param searchElement the searched element
     * @param from start index
     * @return last index of searched element
     */
    @JsMethod
    int lastIndexOf(T searchElement, int from);

    @JsMethod
    int lastIndexOf(T searchElement);

    /**
     * Returns a shallow copy of a portion of an array into a new array object.
     *
     * @param begin Zero-based index at which to begin extraction
     * @param end Zero-based index at which to end extraction. slice extracts up
     * to but not including end
     * @return an array.
     */
    @JsMethod
    T slice(int begin, int end);

    /**
     * changes the content of an array by removing existing elements and/or
     * adding new elements
     *
     * @param start Index at which to start changing the array (with origin 0).
     * If greater than the length of the array, actual starting index will be
     * set to the length of the array. If negative, will begin that many
     * elements from the end.
     *
     * @param deleteCount An integer indicating the number of old array elements
     * to remove. If deleteCount is 0, no elements are removed. In this case,
     * you should specify at least one new element. If deleteCount is greater
     * than the number of elements left in the array starting at start, then all
     * of the elements through the end of the array will be deleted. If
     * deleteCount is omitted, deleteCount will be equal to (arr.length -
     * start).
     *
     * @param elements The elements to add to the array, beginning at the start
     * index. If you don't specify any elements, splice() will only remove
     * elements from the array.
     *
     * @return An array containing the deleted elements. If only one element is
     * removed, an array of one element is returned. If no elements are removed,
     * an empty array is returned.
     */
    @JsMethod
    @SuppressWarnings("unchecked")
    JSArray<T> splice(int start, int deleteCount, T... elements);

    @JsMethod
    JSArray<T> splice(int start, int deleteCount);

    @JsMethod
    JSArray<T> splice(int start);

    /**
     * The reverse method transposes the elements of the calling array object in
     * place, mutating the array, and returning a reference to the array.
     *
     * @return the reversed array
     */
    @JsMethod
    JSArray<T> reverse();

    /**
     * Sorts the elements of an array in place and returns the array. The sort
     * is not necessarily stable. The default sort order is according to string
     * Unicode code points.
     *
     * @return sorted array.
     */
    @JsMethod
    JSArray<T> sort();

    /**
     * Sorts the elements of an array in place and returns the array.
     *
     * @param compareFunction compareFunction Optional. Specifies a function
     * that defines the sort order. If omitted, the array is sorted according to
     * each character's Unicode code point value, according to the string
     * conversion of each element.
     * @return sorted array
     */
    @JsMethod
    JSArray<T> sort(CallbackRet2<Boolean, T, T> compareFunction);

    /**
     * Joins all elements of an array into a string
     *
     * @param separator Optional, default is ",". Specifies a string to separate
     * each element of the array. The separator is converted to a string if
     * necessary. If omitted, the array elements are separated with a comma. If
     * separator is an empty string, all elements are joined without any
     * characters in between them.
     *
     * @return the joined array as string.
     */
    @JsMethod
    String join(String separator);

    @JsMethod
    String join();

    /**
     * fills all the elements of an array from a start index to an end index
     * with a static value.
     *
     * @param value Value to fill an array.
     * @param start Optional, default is 0. Start index.
     * @param end Optional, default is length. End index.
     * @return the array
     */
    @JsMethod
    String fill(T value, int start, int end);

    @JsMethod
    String fill(T value, int start);

    @JsMethod
    String fill(T value);

    /**
     * Executes a provided function once per array element.
     *
     * @param thisArg Optional. Value to use as this when executing callback.
     *
     * @param callback Function to execute for each element, taking three
     * arguments: - currentValue The current element being processed in the
     * array. - index The index of the current element being processed in the
     * array. - array The array that forEach() is being applied to.
     */
    @JsMethod
    void forEach(Callback3<T, Integer, JSArray<T>> callback, @JsOptional Object thisArg);

    @JsMethod
    void forEach(Callback3<T, Integer, JSArray<T>> callback);

    /**
     * tests whether all elements in the array pass the test implemented by the
     * provided function.
     *
     * @param thisArg Optional. Value to use as this when executing callback.
     *
     * @param callback Function to test for each element, taking three
     * arguments: - currentValue The current element being processed in the -
     * index The index of the current element being processed in the - array The
     * array that forEach() is being applied to.
     * 
     * @return true if every element satisfy the test.
     */
    @JsMethod
    boolean every(Callback3<T, Integer, JSArray<T>> callback, @JsOptional Object thisArg);

    @JsMethod
    boolean every(Callback3<T, Integer, JSArray<T>> callback);

    /**
     * tests whether some element in the array passes the test implemented by
     * the provided function.
     *
     * @param thisArg Optional. Value to use as this when executing callback.
     *
     * @param callback Function to test for each element, taking three
     * arguments: - currentValue The current element being processed in the -
     * index The index of the current element being processed in the - array The
     * array that forEach() is being applied to.
     * @return true if some element found
     */
    @JsMethod
    boolean some(Callback3<T, Integer, JSArray<T>> callback, @JsOptional Object thisArg);

    @JsMethod
    boolean some(Callback3<T, Integer, JSArray<T>> callback);

    /**
     * creates a new array with all elements that pass the test implemented by
     * the provided function.
     *
     * @param thisArg Optional. Value to use as this when executing callback.
     *
     * @param callback Function to test for each element, taking three
     * arguments: - currentValue The current element being processed in the -
     * index The index of the current element being processed in the - array The
     * array that forEach() is being applied to.
     * @return of elements that satisfy the test
     */
    @JsMethod
    JSArray<T> filter(Callback3<T, Integer, JSArray<T>> callback, @JsOptional Object thisArg);

    @JsMethod
    JSArray<T> filter(Callback3<T, Integer, JSArray<T>> callback);

    /**
     * Finds a value in the array, if an element in the array satisfies the
     * provided testing function. Otherwise undefined is returned.
     *
     * @param thisArg Optional. Value to use as this when executing callback.
     *
     * @param callback Function to test for each element, taking three
     * arguments: - currentValue The current element being processed in the -
     * index The index of the current element being processed in the - array The
     * array that forEach() is being applied to.
     * @return * @return true if some element found
     */
    @JsMethod
    T find(Callback3<T, Integer, JSArray<T>> callback, @JsOptional Object thisArg);

    @JsMethod
    T find(Callback3<T, Integer, JSArray<T>> callback);

    /**
     * Finds an index in the array, if an element in the array satisfies the
     * provided testing function. Otherwise -1 is returned.
     *
     * @param thisArg Optional. Value to use as this when executing callback.
     *
     * @param callback Function to test for each element, taking three
     * arguments: - currentValue The current element being processed in the -
     * index The index of the current element being processed in the - array The
     * array that forEach() is being applied to.
     * @return  the index if found, -1 otherwise
     */
    @JsMethod
    int findIndex(Callback3<T, Integer, JSArray<T>> callback, @JsOptional Object thisArg);

    @JsMethod
    int findIndex(Callback3<T, Integer, JSArray<T>> callback);

    /**
     * The array size.
     *
     * @return the length
     */
    @JsProperty
    int getLength();

}
