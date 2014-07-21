package co.poynt.api.model;

public enum CommandType {
    REFRESH_STATS("RS");

    private String commandType;

    CommandType(String commandType) {
        this.commandType = commandType;
    }

    public String commandType() {
        return this.commandType;
    }

    public static CommandType findByCommandType(String commandType) {
        for (CommandType v : values()) {
            if (v.commandType().equals(commandType)) {
                return v;
            }
        }
        return null;
    }
}
