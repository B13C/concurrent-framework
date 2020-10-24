package com.geoxus.promise.framework;

/**
 * Listens to the result of a {@link Future}.
 * The result of the asynchronous operation is notified once
 * this listener is added by calling {@link Future#addListener(FutureListener)}.
 *
 * @author britton
 * @version 1.0
 * @since 2020-10-23
 */
public interface FutureListener<V> {
    /**
     * Invoked when the operation associated with the {@link Future} has been completed.
     *
     * @param future the source {@link Future} which called this callback
     */
    void operationComplete(Future<V> future) throws Exception;
}
