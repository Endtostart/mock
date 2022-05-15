package org.mock.common.transfer;

public interface Message {
    <T> T serialize();

    <T> T deserialize();
}
