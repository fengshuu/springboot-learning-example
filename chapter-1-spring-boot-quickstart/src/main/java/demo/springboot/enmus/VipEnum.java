package demo.springboot.enmus;


import demo.springboot.enumConvertor.IEnum;

public enum VipEnum implements IEnum<String> {
    HUANG("1", "黄钻"),
    HONG("2", "红钻");
    private String id;
    private String value;

    VipEnum(String id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
