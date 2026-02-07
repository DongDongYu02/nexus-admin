package cn.dong.nexus.core.security.enums;

public enum Client {

    /**
     * 管理后台
     */
    ADMIN("admin"),
    /**
     * 移动端
     */
    APP("app");

    private final String code;

    public String getCode() {
        return code;
    }

    Client(String code) {
        this.code = code;
    }
}
