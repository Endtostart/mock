package org.mock.common.transfer;

import java.util.Map;

public class MockMessage implements Message {

    private String transId;
    private String funcKey;
    private Map<String, String> tags;

    private String result;

    @Override
    public String serialize() {
        // todo
        return null;
    }

    @Override
    public String deserialize() {
        return result;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getFuncKey() {
        return funcKey;
    }

    public void setFuncKey(String funcKey) {
        this.funcKey = funcKey;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
