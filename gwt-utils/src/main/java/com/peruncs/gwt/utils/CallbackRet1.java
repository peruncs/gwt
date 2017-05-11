package com.peruncs.gwt.utils;

/**
 * A callback that takes 1 input.
 *
 */
public interface CallbackRet1<R, A> {
    R call(A param1);
}
