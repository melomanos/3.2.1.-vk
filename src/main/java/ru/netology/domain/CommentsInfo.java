package ru.netology.domain;

import java.util.Date;
import java.util.List;

public class CommentsInfo {
    private String id;
    private List sortedBy;
    private String commenterUrl;
    private boolean responseInfo;
    private String complainUrl;
    private String message;
    private Date dateOfComment;
    private String response;
    private List onWhoseBehalf;
    private String writeMessage;
    private String addedPhotoUrl;
    private String addedVideoUrl;
    private String addedPAudioUrl;
    private String addedFileUrl;
    private List emoji;
    private boolean send;
    private int commentsCounter;

    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List getSortedBy() {
        return sortedBy;
    }

    public void setSortedBy(List sortedBy) {
        this.sortedBy = sortedBy;
    }

    public String getCommenterUrl() {
        return commenterUrl;
    }

    public void setCommenterUrl(String commenterUrl) {
        this.commenterUrl = commenterUrl;
    }

    public boolean isResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(boolean responseInfo) {
        this.responseInfo = responseInfo;
    }

    public String getComplainUrl() {
        return complainUrl;
    }

    public void setComplainUrl(String complainUrl) {
        this.complainUrl = complainUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(Date dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List getOnWhoseBehalf() {
        return onWhoseBehalf;
    }

    public void setOnWhoseBehalf(List onWhoseBehalf) {
        this.onWhoseBehalf = onWhoseBehalf;
    }

    public String getWriteMessage() {
        return writeMessage;
    }

    public void setWriteMessage(String writeMessage) {
        this.writeMessage = writeMessage;
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

    public List getEmoji() {
        return emoji;
    }

    public void setEmoji(List emoji) {
        this.emoji = emoji;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public int getCommentsCounter() {
        return commentsCounter;
    }

    public void setCommentsCounter(int commentsCounter) {
        this.commentsCounter = commentsCounter;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
