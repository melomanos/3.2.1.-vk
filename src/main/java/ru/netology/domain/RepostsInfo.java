package ru.netology.domain;

import java.util.List;

public class RepostsInfo {
    private List listOfWhereShared;
    private String receiverName;
    private String writeMessage;
    private List emoji;
    private String addedPhotoUrl;
    private String addedVideoUrl;
    private String addedPAudioUrl;
    private String addedFileUrl;
    private boolean send;
    private int shareCounter;

    private int userReposted;

    public List getListOfWhereShared() {
        return listOfWhereShared;
    }

    public void setListOfWhereShared(List listOfWhereShared) {
        this.listOfWhereShared = listOfWhereShared;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getWriteMessage() {
        return writeMessage;
    }

    public void setWriteMessage(String writeMessage) {
        this.writeMessage = writeMessage;
    }

    public List getEmoji() {
        return emoji;
    }

    public void setEmoji(List emoji) {
        this.emoji = emoji;
    }

    public String getAddedPhotoUrl() {
        return addedPhotoUrl;
    }

    public void setAddedPhotoUrl(String addedPhotoUrl) {
        this.addedPhotoUrl = addedPhotoUrl;
    }

    public String getAddedVideoUrl() {
        return addedVideoUrl;
    }

    public void setAddedVideoUrl(String addedVideoUrl) {
        this.addedVideoUrl = addedVideoUrl;
    }

    public String getAddedPAudioUrl() {
        return addedPAudioUrl;
    }

    public void setAddedPAudioUrl(String addedPAudioUrl) {
        this.addedPAudioUrl = addedPAudioUrl;
    }

    public String getAddedFileUrl() {
        return addedFileUrl;
    }

    public void setAddedFileUrl(String addedFileUrl) {
        this.addedFileUrl = addedFileUrl;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public int getShareCounter() {
        return shareCounter;
    }

    public void setShareCounter(int shareCounter) {
        this.shareCounter = shareCounter;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
