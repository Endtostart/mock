package org.mock.common.transfer;

public interface Caller<R> {
    R call(Message message);
}
