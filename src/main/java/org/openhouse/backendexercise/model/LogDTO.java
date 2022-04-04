package org.openhouse.backendexercise.model;

public class LogDTO {
    private String userId;
    private String sessionId;

//    private LinkedList<> actions


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "LogDTO{" +
                "userId='" + userId + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
