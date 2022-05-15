package org.mock.common.transfer;

public class SimpleMessageBuilder implements MessageBuilder {

    @Override
    public Message build() {
        // todo set field value
        return new MockMessage();
    }

}
