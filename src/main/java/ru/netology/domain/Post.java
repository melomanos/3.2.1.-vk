package ru.netology.domain;

import java.util.Date;
import java.util.List;

public class Post {
    private String id;
    private String logoUrl;
    private String posterUrl;
    private String mainPageUrl;
    private boolean postIsFixed;
    private String complainUrl;
    private boolean saveToBookmarks;
    private boolean subscribe;
    private Date dateOfPost;
    private String message;
    private boolean showInFull;
    private String imageUrl;
    private int likesCounter;
    private List listOfLikers;
    private int commentsCounter;
    private int shareCounter;
    private int viewsCounter;

    private int ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int canPost;
    private int groupsCanPost;
    private int canClose;
    private int canOpen;
    private String copyright;
    private int userLikes;
    private int canLike;
    private int canPublish;
    private int userReposted;
    private String postType;
    private String geoType;
    private String geoCoordinates;
    private String geoPlace;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int markedAsAds;
    private int postponedId;
}
