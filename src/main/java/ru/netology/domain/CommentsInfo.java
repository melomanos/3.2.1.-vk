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

    private int canPost;
}
